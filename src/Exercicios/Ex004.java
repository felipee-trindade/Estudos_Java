package Exercicios;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        char letra;
        int num;
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = tc.nextInt();
        letra = conversao(num);
        System.out.println("A letra escolhida foi: " + letra);
    }
    
    public static char conversao(int num) {
        num += 64;
        char letra = (char) num;
        return letra;
    }
}
