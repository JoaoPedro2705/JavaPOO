
package Aula04_Ex01_Midias;

public class Filme extends Midia{
    
    private String diretor;
    private String genero;
    
    public Filme(String titulo, int duracaoMins, String diretor, String genero) {
        super(titulo, duracaoMins);
        this.diretor = diretor;
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }       
}
