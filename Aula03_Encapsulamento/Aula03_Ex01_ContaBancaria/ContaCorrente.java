package Aula03_Ex01_ContaBancaria;

public class ContaCorrente implements Conta {

    private double deposito;
    private double sacar;
    private double saldo;
    
      public ContaCorrente(double saldo, double sacar, double deposito) {
        this.saldo = saldo;
        this.sacar = sacar;
        this.deposito = deposito;
    }

    ContaCorrente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar() {
        saldo = saldo - sacar;
                System.out.println("Valor sacado: "+sacar+". \n Saldo após Saque: "+sacar);

    }

    @Override
    public void depositar() {
        saldo = saldo + deposito;
        System.out.println("Valor depositado: "+deposito+".\n Saldo após Depósito: "+deposito);
    }

    @Override
    public void saldo() {
        System.out.println("Seu saldo atual: "+saldo);
    }
    
}
