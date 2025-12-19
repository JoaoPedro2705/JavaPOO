package Aula02_Ex04_Livro;

public class main {
    public static void main(String[] args) {
        Livro novoLivro = new Livro ("Rainbow Six", "Tom Clancy", 1998, true);
        
        System.out.println("\n Informações do Livro : ");
        System.out.println("Titulo: "+novoLivro.getTitulo());
        System.out.println("Autor: "+novoLivro.getAutor());
        System.out.println("Ano de publicação: "+novoLivro.getAnoPublicacao());
        System.out.println("");
        
        System.out.println("Pegando Emprestado o Livro: ");
         
        novoLivro.emprestarLivro();
        
        System.out.println("");
        System.out.println("Devolvendo o livro");
        novoLivro.devolverLivro();
        
        
    }
}
