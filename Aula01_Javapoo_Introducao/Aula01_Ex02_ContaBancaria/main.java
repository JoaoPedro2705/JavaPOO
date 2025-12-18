
package Aula01_Ex02_ContaBancaria;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        contaBancaria conta1 = new contaBancaria();
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Informe o Numero da sua Conta : ");
        conta1.numeroDaConta = tc.nextLine();
        
        System.out.println("Informe o Nome do titular da Conta : ");
        conta1.titular = tc.nextLine();
        
        System.out.println("Informe seu Saldo atual");
        conta1.saldo = tc.nextDouble();
        
        System.out.println("Informe o valor que deseja depositar: ");
        conta1.depositar = tc.nextDouble();
        conta1.depositarValor();
        
        System.out.println();
        System.out.println("Informe o valor que deseja sacar: ");
        conta1.sacar = tc.nextDouble();
        conta1.sacarValor();
    }
}
