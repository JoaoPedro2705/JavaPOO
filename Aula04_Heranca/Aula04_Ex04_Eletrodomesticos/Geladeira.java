
package Aula04_Ex04_Eletrodomesticos;

public class Geladeira extends Eletrodomestico {
    
    protected int temperatura;
    
    public Geladeira(String marca, String modelo) {
        super(marca, modelo);
        this.temperatura = 4;
    }
    
    public void ajustarTemp(int novaTemp){
        temperatura = novaTemp;
        System.out.println("A temperatura foi ajustada para: "+ temperatura + " graus. " );
    }
}
