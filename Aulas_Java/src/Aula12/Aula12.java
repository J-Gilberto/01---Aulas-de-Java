package Aula12;

import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {

        /* Lembrar de sempre usar /* de entrada e a sainda */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Entre com o seu nome completo: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeriro nome é: " + primeiroNome);

        System.out.println("Entre com a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

    }
}
