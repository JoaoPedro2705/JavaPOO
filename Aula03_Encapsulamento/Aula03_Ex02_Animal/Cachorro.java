package Aula03_Ex02_Animal;

public class Cachorro implements Animal{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Cachorro(String nome) {
        this.nome = nome;
       
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU AU");
    }

    @Override
    public void nomeAnimal() {
        System.out.println("Nome do Cachorro é "+nome+". ");
    }
}
