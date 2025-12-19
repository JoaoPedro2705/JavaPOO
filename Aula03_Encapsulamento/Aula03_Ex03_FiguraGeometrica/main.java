package Aula03_Ex03_FiguraGeometrica;

public class main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5);
        Retangulo r1 = new Retangulo(4, 8);
        
        System.out.println(" -- CALCULOS DO CIRCULO -- ");
        System.out.println();
        System.out.println("Area do Circulo : "+ c1.calcularArea());
        System.out.println("Perimetro do Circulo: "+ c1.calcularPerimetro());
        System.out.println();
        System.out.println(" -- CALCULOS DO RETANGULO -- ");
        System.out.println();
        System.out.println("Area do Retangulo: "+ r1.calcularArea());
        System.out.println("Perimetro do Retangulo: "+r1.calcularPerimetro());
        
    }
}
