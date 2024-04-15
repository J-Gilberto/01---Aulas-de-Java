package Aula13_1;

import java.util.Scanner;

public class Exercicio13_10 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o 1° valor inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o 2° valor inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com um valor real: ");
        double num3 = scan.nextDouble();

        double total1 = (num1 * 2) + num2 / 2;
        System.out.println("Resultado da letra (A): " + total1);

        double total2 = (num1 * 3) + num3;
        System.out.println("Resultado da letra (B): " + total2);

        double total3 = num3 * num3 * num3;
        System.out.println("Resultado da letra (C)" + total3);

    }

}
