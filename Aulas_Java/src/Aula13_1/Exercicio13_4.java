package Aula13_1;

import java.util.Scanner;

public class Exercicio13_4 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor em Metros: ");
        int metros = scan.nextInt();

        int totalCentimetro = metros * 100;
        System.out
                .println("Seus " + metros + " Metros foram convertidos em: " + totalCentimetro
                        + " Centimetros");
    }

}
