
package Aula01_Ex05_Circulo;

public class Circulo {
    double raio;
    
    double calcularArea(){
        return Math.PI * raio * raio;
    }
    
    double calcularCircunferencia(){
        return 2 * Math.PI * raio;
    }
}
