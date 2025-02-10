package Exercicios;
import java.util.Random;

public class Ex001 {
    public static void main(String[] args) {
        
        int matriz[][][][] = new int[5][5][5][5];

        preencher(matriz);
        imprimir(matriz);
        System.out.println();
        
    }

    public static void preencher(int[][][][] m) {
        Random rand = new Random();

        for(int linha = 0; linha < m.length; linha++ ) {
            for(int col = 0; col < m.length; col++) {
                for(int col1 = 0; col1 < m.length; col1++) {
                    for(int col2 = 0; col2 < m.length; col2++) {
                        m[linha][col][col1][col2] = rand.nextInt(101);
                    }
                }
            }
        }    
    }

    public static void imprimir(int[][][][] m) {

        for(int linha = 0; linha < m.length; linha++ ) {
            System.out.println();
            for(int col = 0; col < m.length; col++) {
                System.out.println();
                for(int col1 = 0; col1 < m.length; col1++) {
                    System.out.println();
                    for(int col2 = 0; col2 < m.length; col2++) {
                        System.out.printf("[ %03d ] ", m[linha][col][col1][col2]);
                    }
                }
            }
        }
    }
}
