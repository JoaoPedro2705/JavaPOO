
package Aula03_Ex06_Dispositivos;

public class TV implements DispositivoEletronico{
    
    private boolean ligada;

    @Override
    public void ligar() {
        ligada = true;
        System.out.println("TV Ligada. ");
    }

    @Override
    public void desligar() {
        ligada = false;
        System.out.println("TV Desligada. ");
    }

    @Override
    public void obterStatus() {
     if(ligada){
         System.out.println("TV Está ligada. ");
     }else{
         System.out.println("TV Está desligada. ");
     }
    }
    
}
