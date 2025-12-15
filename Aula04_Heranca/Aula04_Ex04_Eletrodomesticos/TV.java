
package Aula04_Ex04_Eletrodomesticos;

public class TV extends Eletrodomestico {
    
    private int canal;
    private int volume;
    
    public TV(String marca, String modelo) {
        super(marca, modelo);
        this.canal = 1;
        this.volume = 14;
    }
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para: "+volume);
    }
    
    public void mudarCanal(int outroCanal){
        canal = outroCanal;
        System.out.println("Canal trocado para: Canal "+ canal);
    }
}
