package Aula02_Ex02_ContaBancaria;

public class ContaBancaria {
    
    private int numeroConta;
    private double saldo;
    private String titular;
    
    public ContaBancaria (int nc, double s, String t) {
        this.numeroConta = nc;
        this.saldo = s;
        this.titular = t;
       
    }
    
    void depositarValor(double valor){
      valor = this.saldo + valor;
      System.out.println("Depósito realizado: valor de R$ " + valor);
 
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
        
    }
    
}

