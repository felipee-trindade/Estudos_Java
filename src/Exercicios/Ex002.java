package Exercicios;

import java.util.Random;

public class Ex002 {
    public static void main(String[] args) {
        int[] matriz = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int processos = 0;

        Random rand = new Random();

        int aleatorio = rand.nextInt(16);

        int valor = matriz[aleatorio];
         
        int baixo = 0;
        int maior = matriz.length - 1;

        while (baixo <= maior) {
            int meio = (baixo + maior) / 2;
            processos++;
            if(valor == matriz[meio]) {
                System.out.println("Valor correto");
                break;
            }
            if(valor > matriz[meio]) {
                baixo = meio + 1;
            }
            if (valor < matriz[meio]) {
                maior = meio - 1;
            }
        }
        System.out.println("Valor: " + valor + "\nProcessos: " + processos);
    }
}
