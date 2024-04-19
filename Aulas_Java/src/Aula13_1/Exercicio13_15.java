package Aula13_1;

import java.util.Scanner;

public class Exercicio13_15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com os metros que vão ser pintados: ");
        double metroQuadrado = scan.nextInt();
        double litro = metroQuadrado / 6;
        double balde = litro / 18;
        double valorArredondado = Math.ceil(balde);
        double valorDaCompra = valorArredondado * 80;
        System.out.println(
                "Você vai gastar em Baldes: " + valorArredondado + " e o total a pagar é de R$ " + valorDaCompra);

    }

}
