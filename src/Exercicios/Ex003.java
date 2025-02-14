package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Digite o tamanho do array: ");
        int tamanho = tc.nextInt();
        int[] numeros = new int[tamanho];
        System.out.print("Digite o valor de busca: ");
        int escolha = tc.nextInt();

        preencher(numeros, rand);
        buscar(numeros, escolha);

        tc.close();
        
    }

    public static void preencher(int[] numeros, Random rand) {
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }
    }

    public static void buscar(int[] numeros, int escolha) {
        int qtd = 0;
        for (int i : numeros) {
            if(escolha == i) {
                qtd++;
            }
        }
        if(qtd > 0){
            System.out.printf("A quantidade do número %d no array é %d%n%n", escolha, qtd);
        }
        else {
            System.out.printf("A quantidade do número %d no array é %d%n%n", escolha, qtd);
        }
    }
}
