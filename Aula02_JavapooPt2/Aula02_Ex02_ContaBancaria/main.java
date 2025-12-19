package Aula02_Ex02_ContaBancaria;

public class main {
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria(9345, 2000, "Gabriel Lenom");
        
        System.out.println("\nInformações Bancarias: ");
        System.out.println("ID da Conta: "+cb1.getNumeroConta());
        System.out.println("Saldo: "+cb1.getSaldo());
        System.out.println("Titular da conta: "+cb1.getTitular());
        System.out.println();
        cb1.depositarValor(500);
        System.out.println("Novo saldo: " + cb1.getSaldo());
        
                
    }
}
