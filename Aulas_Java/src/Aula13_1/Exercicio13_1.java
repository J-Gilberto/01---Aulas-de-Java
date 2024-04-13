package Aula13_1;

import java.util.Scanner;

public class Exercicio13_1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o seu nome Completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Sua idade: ");
        int suaIdade = scan.nextInt();
        System.out.println("Você se chama: " + nomeCompleto + " Sua idade é: " + suaIdade + " Anos");

    }

}
