
package Aula01_Ex03_Carro;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Informe a marca do veiculo: ");
        c1.marca = tc.nextLine();
        System.out.println();
        System.out.println("Informe o modelo do veiculo: ");
        c1.modelo = tc.nextLine();
        System.out.println();
        System.out.println("Informe o ano do veiculo: ");
        c1.ano = tc.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("Informações do Veiculo: ");
        System.out.println("Marca: "+c1.marca);
        System.out.println("Modelo: "+c1.modelo);
        System.out.println("Ano: "+c1.ano);
        System.out.println("-------------------------------");
        System.out.println();
        
        System.out.println("Ligando carro: ");
        c1.ligar();
        System.out.println();
        System.out.println();
        System.out.println("Desligando carro: ");
        c1.desligar();
        
        
    }
}
