package Aula03_Ex01_ContaBancaria;

public class main {

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(1000, 200, 50);

        System.out.println("\nExtrato da Conta hoje: ");
        cc1.saldo();
        System.out.println();
        System.out.println("--- SAQUE ---");
        System.out.println();
        cc1.sacar();
        System.out.println();
        System.out.println("--- DEPOSITO ---");
        System.out.println();
        cc1.depositar();
        System.out.println("");

    }
}
