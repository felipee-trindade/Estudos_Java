package batalha_naval;

import java.util.ArrayList;

public class SimpleDotCom {

    String nome;
    ArrayList<Integer> locationCells;

    void setLocationCells(ArrayList<Integer> locs) {
        locationCells = locs;
    }

    public String checkYourself(int userInput) {

        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if(index >= 0) {
            locationCells.remove(index);

            if(locationCells.isEmpty()) {
                result = "kill";
            }
            else {
                result = "hit";
            }
        }

        System.out.println(result);

        return result;
    }
}
