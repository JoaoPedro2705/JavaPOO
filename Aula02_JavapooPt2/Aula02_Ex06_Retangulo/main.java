package Aula02_Ex06_Retangulo;

public class main {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(6, 4);

        System.out.println("Informações do Retangulo: ");
        System.out.println();
        System.out.println("Largura: " + r1.getLargura());
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Area: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());
    }

}
