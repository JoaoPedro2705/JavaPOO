
package Aula01_Ex04_Retangulo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Informe a altura do Retangulo :");
        retangulo1.altura = tc.nextDouble();
        System.out.println();
        
        System.out.println("Informe a base do Retangul");
        retangulo1.base = tc.nextDouble();
        System.out.println();
        
        retangulo1.apresentar();
        
       
        double perimetro = retangulo1.calcularPerimetro();
        double area = retangulo1.calcularArea();
        
        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A área do retângulo é: " + area);
    }
    
}
