
package Aula02_Ex07_Circulo;

public class main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo (10);
        
        System.out.println("Informações do Circulo: ");
        System.out.println("");
        System.out.println("Raio: "+c1.getRaio());
        System.out.println("Area: "+c1.calcularArea());
        System.out.println("Circunferencia: "+c1.calcularCircunFerencia());
    }
}
