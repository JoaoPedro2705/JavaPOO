
package Aula04_Ex04_Eletrodomesticos;

public class main {
    public static void main(String[] args) {
        
        TV t1 = new TV ("TCL","C6K");
        Geladeira g1 = new Geladeira ("Samsung","Duplex Inverse");
        MicroOndas mo1 = new MicroOndas ("Electrolux","MEO44");
        
        System.out.println("Testando a TV: ");
        if(t1.ligado){
            System.out.println("TV Está Ligada. ");
        }else{
            System.out.println("TV Está Desligada. ");
        }
        
        System.out.println();
        System.out.println("Mudando o Canal: ");
        t1.mudarCanal(7);
        System.out.println();
        System.out.println("Aumentando o volume: ");
        t1.aumentarVolume();
        System.out.println();
        System.out.println("Desligando a TV: ");
        
        t1.desligar();
        
        if(!t1.ligado){
            System.out.println("TV Desligada . ");
        }
        
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("Testando a Geladeira: ");
        System.out.println();
        if(g1.ligado){
            System.out.println("Geladeira está Ligada. ");      
        }else{
            System.out.println("Geladeira está Desligada. ");
    }
        System.out.println();
        System.out.println("Ajustando a temperatura: ");
        g1.ajustarTemp(8);
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
        
        
        System.out.println("Testando o MicroOndas: ");
        System.out.println();
        if(mo1.ligado){
            System.out.println("MicroOndas está Ligado. ");
        }else{
            System.out.println("MicroOndas está Desligado. ");
        }
        
        System.out.println();
        System.out.println("Ajustando Potencia : ");
        mo1.ajustePotencia(500);
        System.out.println();
        
        
    }
}
