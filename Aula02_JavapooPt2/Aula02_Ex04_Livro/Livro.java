package Aula02_Ex04_Livro;

public class Livro {

    private String titulo, autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String t, String a, int ap, boolean d) {
        this.titulo = t;
        this.autor = a;
        this.anoPublicacao = ap;
        this.disponivel = d;
    }

    void emprestarLivro() {
        if (disponivel) {
            System.out.println("O livro está diponivel para ser emprestado. ");
            this.disponivel = false;
        }          
    }

    void devolverLivro() {
        if(!disponivel) {
            System.out.println("O livro não está disponivel, ainda não foi devolvido");
            this.disponivel = true;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
}
