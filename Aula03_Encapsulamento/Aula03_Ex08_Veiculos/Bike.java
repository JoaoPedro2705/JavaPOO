
package Aula03_Ex08_Veiculos;

public class Bike implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("A bike está pedalando mais rapido. ");
    }

    @Override
    public void frear() {
        System.out.println("A bike está freando. ");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("A bike virou para a "+ direcao + ". ");
    }
    
}
