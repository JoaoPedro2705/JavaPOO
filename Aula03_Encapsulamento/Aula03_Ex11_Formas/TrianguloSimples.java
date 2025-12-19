
package Aula03_Ex11_Formas;

public class TrianguloSimples implements Forma {

    private double lado;

    public TrianguloSimples(double lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double calcularArea() {
        return (lado * lado) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }
    
}
