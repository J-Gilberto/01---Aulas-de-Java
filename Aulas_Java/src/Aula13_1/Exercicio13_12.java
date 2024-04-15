package Aula13_1;

import java.util.Scanner;

public class Exercicio13_12 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Entre com o seu sexo: ");
        char sexo = scan.next().charAt(0);

        double pesoIdeal;
        double divi = altura / 100;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * divi) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * divi) - 44.7;
        } else {
            System.out.println("Você entrou com dados errados! Use M para 'Masculo' e 'F'pra fema.");

            return;
        }

        System.out.println("Entre com o seu peso: ");
        double pesado = scan.nextDouble();

        if (pesado < pesoIdeal) {
            System.out.println(
                    "Então, por precaução irei te amarrar nesta coluna aqui! Seu peso ideal é: " + pesoIdeal + " Kg");
        } else if (pesado > pesoIdeal) {
            System.out.println(
                    "Saia da minha balança pra não quebra-la. Seu peso ideal é " + pesoIdeal + " Kg");
        } else {
            System.out.println(
                    "Eita homi bem nutrido, pense numa pessoa firme na Dieta.  Seu peso ideal é " + pesoIdeal + " Kg");
        }

    }

}
