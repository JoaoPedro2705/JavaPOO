package Aula04_Ex02_Eventos;

public class Workshop extends Evento {

    private String instrutor;

    public Workshop(String nome, String data, String instrutor) {
        super(nome, data);
        this.instrutor = instrutor;
    }    
}
