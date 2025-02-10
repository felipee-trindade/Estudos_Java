package batalha_naval;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        int numOfGuesses = 0;

        Scanner key = new Scanner(System.in);

        SimpleDotCom dot = new SimpleDotCom();

        Random random = new Random();

        int rand = random.nextInt(3);

        ArrayList<Integer> location = new ArrayList<>();

        location.add(rand);
        location.add(rand+1);
        location.add(rand+2);


        dot.setLocationCells(location);

        boolean isAlive = true;

        while (isAlive) {
            System.out.print("Insira um número: ");
            int guess = key.nextInt();

            String result = dot.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;

                System.out.println("Você usou " + numOfGuesses + " palpites\n");
            }
        }

        key.close();
    }
}
