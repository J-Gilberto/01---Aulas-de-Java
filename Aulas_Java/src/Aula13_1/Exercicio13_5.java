package Aula13_1;

import java.util.Scanner;

public class Exercicio13_5 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println("Entre com o valor do Raio: ");
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("O valor da area do raio é: " + area);

    }
}
