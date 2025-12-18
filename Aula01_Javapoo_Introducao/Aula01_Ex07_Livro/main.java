
package Aula01_Ex07_Livro;

public class main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Quixote";
        livro1.autor = "Miguel de Cervantes";
        livro1.anoPublicacao = 1605;
        livro1.disponivel = false;
        
        
      // livro1.emprestar();
      livro1.devolver();
        livro1.devolver(); 
    }
}
