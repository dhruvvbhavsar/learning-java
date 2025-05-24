import java.util.ArrayList;

public class SimpleStartupGame {
    public static void main(String[] args) {
      int numOfGuesses = 0;
      GameHelper helper = new GameHelper();

      SimpleStartup theStartup = new SimpleStartup();
      int randomNum = (int) (Math.random() * 5);

      ArrayList<String> locations = new ArrayList<>();
      locations.add(String.valueOf(randomNum));
      locations.add(String.valueOf(randomNum + 1));
      locations.add(String.valueOf(randomNum + 2));
      theStartup.setLocationCells(locations);

      boolean isAlive = true;

      while (isAlive) {
        String guess = helper.getUserInput("enter a guess");
        String result = theStartup.checkYourself(guess);
        numOfGuesses++;

        if (result.equals("kill")) {
          isAlive = false;
          System.out.println("You took " + numOfGuesses + " guesses");
        }
      }
    }
}