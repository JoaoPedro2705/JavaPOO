
package Aula03_Ex11_Formas;

public class main {
    public static void main(String[] args) {
        
        Quadrado q1 = new Quadrado(4);
        TrianguloSimples t1 = new TrianguloSimples(3);
        Circulo c1 = new Circulo(2);

        System.out.println("Area do quadrado: " + q1.calcularArea());
        System.out.println("Perimetro do quadrado: " + q1.calcularPerimetro());
        
        System.out.println();

        System.out.println("Area do triângulo: " + t1.calcularArea());
        System.out.println("Perimetro do triângulo: " + t1.calcularPerimetro());
        
        System.out.println();

        System.out.println("Area do circulo: " + c1.calcularArea());
        System.out.println("Perimetro do circulo: " + c1.calcularPerimetro());
    }
}
    

