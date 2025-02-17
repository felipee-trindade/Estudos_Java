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
        int[] qtd_total = new int[101];


        preencher(numeros, rand, qtd_total);
        buscar(numeros, escolha);
        quantificar(numeros, qtd_total);
        
    }

    public static void preencher(int[] numeros, Random rand, int[] qtd_total) {
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(101);
        }
        for(int j = 0; j < qtd_total.length; j++) {
            qtd_total[j] = 0;
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

    public static void quantificar(int[] numeros, int[] qtd_total) {
        for (int i : numeros) {
            qtd_total[i] += 1;
        }
        for (int j = 0; j < qtd_total.length; j++) {
            System.out.printf("A quantidade do número [%03d] é: %6d%n", j, qtd_total[j]);
        }
    }
}
