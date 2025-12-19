
package Aula03_Ex06_Dispositivos;

public class Celular implements DispositivoEletronico {
    private boolean ligado = false;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Celular ligado. ");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Celular desligado. ");
    }

    @Override
    public void obterStatus() {
        if(ligado){
            System.out.println("Celular está ligado. ");
        }else{
            System.out.println("Celular está desligado. ");
        }
    }
}
