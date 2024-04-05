package Aula11;

public class CuriosidadeInt {
    public static void main(String[] args) {

        int var1 = 2147483647;
        int var2 = 1;

        System.out.println(var1 + var2);

        // Toda vez que o valor total de um número inteiro (2147483647) for axcedido
        // se torna negativo, como o exemplo da var1 + var2 que o total foi de
        // -2147483648 .
        // Então sempre prestar atenção em possiveis perguntas relacionadas a isso,
        // pois quando o valor chega acima de '2147483647' em uma soma, ele apresenta o
        // menor numero
        // de forma negativa.

    }
}
