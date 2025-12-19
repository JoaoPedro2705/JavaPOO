package Aula03_Ex08_Veiculos;

public class main {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        Moto m1 = new Moto();
        Bike b1 = new Bike();

        c1.acelerar();
        c1.frear();
        c1.virar("direita");

        System.out.println("");

        m1.acelerar();
        m1.frear();
        m1.virar("equerda");

        System.out.println("");
        
        b1.acelerar();
        b1.frear();
        b1.virar("trás");
    }

}
