import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String guess) {
        String result = "miss";

        for (String cell : locationCells) {
            if (guess.equals(cell)) {
                result = "hit";
                locationCells.remove(cell);
                break;
            }
        }

        if (locationCells.isEmpty()) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}