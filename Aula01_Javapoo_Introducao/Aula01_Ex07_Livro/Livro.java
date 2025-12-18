package Aula01_Ex07_Livro;

public class Livro {

    String titulo, autor;
    int anoPublicacao;
    boolean disponivel;

    void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro " + titulo + " emprestado com sucesso.");
        } else {
            System.out.println("Livro " + titulo + " não está disponível para empréstimo");
        }
    }

    void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro " + titulo + " devolvido com sucesso.");
        } else {
            System.out.println("Livro " + titulo + " já está disponível");
        }
    }
}
