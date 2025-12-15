
package Aula04_Ex02_Eventos;

public class Show extends Evento {
   
    private String artista;

    public Show(String nome, String data, String artista) {
        super(nome, data);
        this.artista = artista;
    }
    
}
