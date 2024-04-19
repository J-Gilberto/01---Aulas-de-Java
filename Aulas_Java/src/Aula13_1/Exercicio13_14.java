package Aula13_1;

import java.util.Scanner;

public class Exercicio13_14 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor da sua hora trabalhada: ");
        double horaTrabalhada = scan.nextDouble();

        System.out.println("Quantas Horas trabalhadas por Mês: ");
        int mesTrabalhado = scan.nextInt();

        double total = horaTrabalhada * mesTrabalhado;
        double impostoRenda = 11;
        double inss = 8;
        double sindicato = 5;

        double desconto1 = (total * impostoRenda) / 100;
        double desconto2 = (total * inss) / 100;
        double desconto3 = (total * sindicato) / 100;
        double descontoTotal = (desconto1 + desconto2 + desconto3);
        double liquido = total - descontoTotal;

        System.out.println("Você pagou de Inss: R$ " + desconto2
                + " E sua contribuição com o Sindicato do Crime foi de R$ " + desconto3);
        System.out.println("Seu salario liqueido é de: R$ " + liquido);

    }

}
