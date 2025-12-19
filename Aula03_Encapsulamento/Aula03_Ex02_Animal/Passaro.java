package Aula03_Ex02_Animal;

public class Passaro implements Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Passaro(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println("BemTeVii");
    }

    @Override
    public void nomeAnimal() {
        System.out.println("Nome do Passarinho é "+nome+".");
    }

   
}
