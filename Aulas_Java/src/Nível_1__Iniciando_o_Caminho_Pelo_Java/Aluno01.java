package Nível_1__Iniciando_o_Caminho_Pelo_Java;

import java.util.Random;

public class Aluno01 {

    // Atributos
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

    // Construtor
    public Aluno01(String nome, int idade) {

        aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        this.codigo_identificador = aleatorio.nextDouble();

    }

    // Metodos
    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }

}
