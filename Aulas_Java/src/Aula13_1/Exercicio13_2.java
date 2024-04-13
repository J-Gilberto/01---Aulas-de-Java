package Aula13_1;

import java.util.Scanner;

public class Exercicio13_2 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com 'PRIMEIRO' valor: ");
        int valor1 = scan.nextInt();
        System.out.println("Entre com o 'SEGUNDO' valor: ");
        int valor2 = scan.nextInt();
        int total = valor1 + valor2;
        System.out.println("A soma dos Valores 1 e 2 é: " + total);

    }

}
