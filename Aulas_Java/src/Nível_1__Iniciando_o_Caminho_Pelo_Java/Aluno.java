package Nível_1__Iniciando_o_Caminho_Pelo_Java;

public class Aluno {
    private String nome;

    public void inserirNome(String nn) {
        nome = nn;
    }

    public String recuperarNome() {
        return nome;
    }

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.inserirNome("João Gilberto");
        System.out.println("Saida: " + a.recuperarNome());
    }
}
