
package Aula04_Ex04_Eletrodomesticos;

public class MicroOndas extends Eletrodomestico{
    
    protected int potencia;
    
    public MicroOndas(String marca, String modelo) {
        super(marca, modelo);
        this.potencia = 500;
    }
    
    public void ajustePotencia (int novaPotencia){
        potencia = novaPotencia;
        System.out.println("A potencia foi ajustada para: "+ potencia+ " watts.");
    }
}
