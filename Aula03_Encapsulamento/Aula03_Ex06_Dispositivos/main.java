package Aula03_Ex06_Dispositivos;

public class main {

    public static void main(String[] args) {
        TV t1 = new TV();
        Radio r1 = new Radio();
        Celular c1 = new Celular();

        System.out.println("Testando a TV: ");
        t1.ligar();
        t1.obterStatus();

        System.out.println();
        System.out.println("Testando o radio: ");
        r1.ligar();
        r1.desligar();
        r1.obterStatus();
        System.out.println();

        System.out.println("Testano o celular. ");
        c1.ligar();
        c1.obterStatus();
    }
}
