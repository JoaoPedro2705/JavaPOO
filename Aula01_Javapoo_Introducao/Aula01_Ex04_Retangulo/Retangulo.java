package Aula01_Ex04_Retangulo;

public class Retangulo {

    double base, altura;

    double calcularPerimetro() {
       return 2 * (base + altura);
    }
    
    double calcularArea() {
         return base * altura;
     
    }
       
    void apresentar(){
        System.out.println("O Retangulo informado tem "+base+" de BASE, "+altura+" de ALTURA. ");
    }
}
