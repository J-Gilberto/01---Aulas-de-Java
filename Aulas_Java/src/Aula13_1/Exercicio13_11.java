package Aula13_1;

import java.util.Scanner;

public class Exercicio13_11 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a sua altura: ");
        double altura = scan.nextDouble();

        double divide = altura / 100;
        double ideal = (72.7 * divide) - 58;

        System.out.println("Seu peso ideal é: " + ideal);

    }

}
