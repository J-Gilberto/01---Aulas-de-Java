package Aula13_1;

import java.util.Scanner;

public class Exercicio13_3 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com sua nota do 1° Semestre: ");
        int semestre1 = scan.nextInt();

        System.out.println("Entre com sua nota do 2° Semestre: ");
        int semestre2 = scan.nextInt();

        System.out.println("Entre com sua nota do 3° Semestre ");
        int semestre3 = scan.nextInt();

        System.out.println("Entre com sua nota do 4° Semestre: ");
        int semestre4 = scan.nextInt();

        final float totalNota = (semestre1 + semestre2 + semestre3 + semestre4) / 4;
        System.out.println("Sua media foi de: " + totalNota);

    }
}
