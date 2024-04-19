package Aula13_1;

import java.util.Scanner;

public class Exercicio13_17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de megas do seu douwnload: ");
        double megas = scan.nextDouble();
        System.out.println("Entre com a velociade da sua internet: ");
        double velocidade = scan.nextDouble();
        // Coverter o tamanho do Arquivo
        double tamanhoArquivoMb = megas * 8 * 10224 * 1024;
        // Converter o tempo total do download em segundos
        double tempoDownload = tamanhoArquivoMb / (velocidade * 1024 * 1024);
        // Converter o tempo total do download em minutos
        double minutosPraDownload = tempoDownload / 60;

        System.out.println(
                "Voce vai gastar para baixar " + megas + "Mbs em aproximadamente " + minutosPraDownload + " Minutos");

    }
}
