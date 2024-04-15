package Aula13_1;

import java.util.Scanner;

public class Exercicio13_13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o peso dos peixes: ");
        double balanca = scan.nextDouble();

        double pesoIdeal = balanca - 50;
        double multa = 0;

        if (pesoIdeal > 0) {
            multa = pesoIdeal * 4;
            System.out.println("Você excedeu o peso permidito em: " + pesoIdeal + " Kg");
            System.out.println("Sua multa é de R$ " + multa);

        } else {
            System.out.println("Peso dentro dos limites " + balanca + " Kg");
        }

        scan.close();
    }
}
