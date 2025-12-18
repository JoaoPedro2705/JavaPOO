package Aula01_Ex02_ContaBancaria;

public class contaBancaria {

    String numeroDaConta, titular = null;
    double saldo, depositar, sacar = 0;

    void depositarValor() {
        System.out.println("O Valor de R$" + depositar + ", foi depositado em sua conta. \n Saldo atual : " + (saldo + depositar) );
    }

    void sacarValor() {
            System.out.println("O valor de R$" + sacar + ", foi sacado de sua conta. \n Saldo atual : " +(saldo + depositar - sacar));
        }
    }

