package Aula03_Ex02_Animal;

public class Gato implements Animal {
    private String nome;

    public Gato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.println("Meow ");
    }

    @Override
    public void nomeAnimal() {
        System.out.println("Nome da Gata é "+nome+". ");
    }
    
    
    
}
