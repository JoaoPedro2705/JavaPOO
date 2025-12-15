
package Aula04_Ex01_Midias;

public class Midia {
    protected String titulo;
    protected int duracaoMins;

    public Midia(String titulo, int duracaoMins) {
        this.titulo = titulo;
        this.duracaoMins = duracaoMins;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMins() {
        return duracaoMins;
    }

    public void setDuracaoMins(int duracaoMins) {
        this.duracaoMins = duracaoMins;
    }
      
}
