
package Aula01_Ex05_Circulo;

public class main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo ();
        c1.raio = 12;
        System.out.println();
        System.out.println("Raio do Circulo: "+c1.raio);
        System.out.println();
        System.out.println("Calculo de area: "+c1.calcularArea());
        System.out.println();
        System.out.println("Calculo de circunferencia: "+c1.calcularCircunferencia());
    }
}
