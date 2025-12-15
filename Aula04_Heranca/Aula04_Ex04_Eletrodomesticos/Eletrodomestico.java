
package Aula04_Ex04_Eletrodomesticos;

public class Eletrodomestico {
    protected String marca;
    protected String modelo;
    protected boolean ligado;

    public Eletrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = true;
    }
    
    public void ligar(){
        ligado = true;
    }
    
    public void desligar(){
        ligado = false;
    }
}
