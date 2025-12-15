
package Aula04_Ex02_Eventos;

public class Palestra extends Evento{
    
    private String palestrante;
    
    public Palestra(String nome, String data, String palestrante) {
        super(nome, data);
        this.palestrante = palestrante;        
    }
}
