package adivinhacao;

import java.util.Random;

public class Player {
    public int number = 0;

    public void guess() {
        Random random = new Random();
        number = random.nextInt(10);
        System.out.println("Estou pensando no número " + this.number);
    }
}
