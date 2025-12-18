
package Aula01_Ex03_Carro;

public class Carro {
    String marca, modelo;
    int ano;
    boolean ligado;
    
    void ligar(){
        ligado = true;
        System.out.println("O carro está ligado. ");
    }
    
    void desligar(){
        ligado = false;
        System.out.println("O carro está desligado. ");
    }
    
    
}
