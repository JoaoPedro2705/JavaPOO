
package Aula03_Ex06_Dispositivos;

public class Radio implements DispositivoEletronico{
    
    private boolean ligado = false;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Radio ligado. ");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Radio desligado. ");
    }

    @Override
    public void obterStatus() {
        if(ligado){
            System.out.println("Radio está ligado. ");
        }else{
            System.out.println("Radio está desligado. ");
        }
    }
    
}
