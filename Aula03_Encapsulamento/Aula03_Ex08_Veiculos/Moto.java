
package Aula03_Ex08_Veiculos;

public class Moto implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando. ");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando. ");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("A moto virou para a " + direcao + ". ");
    }
    
}
