package Nível_1__Iniciando_o_Caminho_Pelo_Java;

import java.util.Random;

//Aqui é a clasee
public class Pessoa {

    // Atributos
    private String nome;
    private double codigo_identificador;
    private Random aleatorio;

    // Métodos
    public Pessoa(String nome) {

        aleatorio = new Random();
        this.setNome(nome);
        this.codigo_identificador = aleatorio.nextDouble();

    }

    private void setNome(String nome) {

        this.nome = nome;

    }

    public String getNome() {

        return this.nome;

    }

    public double getCodigoIdentificador() {

        return this.codigo_identificador;

    }

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Teste A - ");
        Pessoa p2 = new Pessoa("Teste B - ");
        System.out.println("Pessoa 1: " + p1.getNome() + "Codigo Indentificador: " + p1.getCodigoIdentificador());
        System.out.println("Pessoa 2: " + p2.getNome() + "Codigo Indentificador: " + p2.getCodigoIdentificador());
    }
}