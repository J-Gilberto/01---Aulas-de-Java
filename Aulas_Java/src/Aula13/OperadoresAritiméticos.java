package Aula13;

public class OperadoresAritiméticos {

    public static void main(String[] args) {

        int resultado = 10 + 20;
        System.out.println("O resultado é: " + resultado);

        resultado = resultado - 5;
        System.out.println("O resultado é: " + resultado);

        resultado = resultado + 4;
        System.out.println("O resultado é: " + resultado);

        resultado = resultado * 3;
        System.out.println("O resultado é: " + resultado);

        resultado = resultado / 2;
        System.out.println("O resultado é: " + resultado);

        resultado = resultado % 10;
        System.out.println("O resultado é: " + resultado);

        String primeiroNome = "Este seria";
        String segundoNome = " Seu nome ";
        String terceiroNome = "João Gilberto";
        String fraseCompleta = primeiroNome + segundoNome + terceiroNome;
        System.out.println(fraseCompleta);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        // 5
        System.out.println(resultado++);
        /*
         * Seria da mesma forma que:
         * System.out.println(resultado)
         * resultado = resultado + 1;
         * resuldato += 1;
         */

        // 7
        System.out.println(++resultado);
        /*
         * Seria a mesma coisa que:
         * resultado += 1;
         * System.out.println(resultado)
         */

    }
}
