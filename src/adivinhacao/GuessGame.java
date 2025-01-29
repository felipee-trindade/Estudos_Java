package adivinhacao;

import java.util.Random;

public class GuessGame {
    public Player p1;
    public Player p2;
    public Player p3;

    public void startGame () {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        Random random = new Random();

        int numberRandomGame = random.nextInt(10);
        System.out.println("Estou pensando em um número entre 0 e 9...");

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        while(true) {

            System.out.println("O número a ser adivinhado é: " + numberRandomGame);

            p1.guess();
            p2.guess();
            p3.guess();

            if (p1.number == numberRandomGame) {
                p1isRight = true;
            }
            if (p2.number == numberRandomGame) {
                p2isRight = true;
            }
            if (p3.number == numberRandomGame) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Temos um vencedor!!");
                if (p1isRight) {
                    System.out.println("O Jogador número 1 acertou!");
                }
                if (p2isRight) {
                    System.out.println("O Jogador número 2 acertou!");
                }
                if (p3isRight) {
                    System.out.println("O Jogador número 3 acertou!");
                }
                System.out.println("Fim de Jogo");
                break;
            } 
            else {
                System.out.println("Nenhum jogador acertou...");
                System.out.println("Os jogadores terão que tentar novamente");
            }


        
        }

        

        

    }
}
