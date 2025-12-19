
package Aula03_Ex08_Veiculos;

public class Carro implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando. ");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando. ");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("O carro virou para a "+ direcao + ". ");
    }
    
}
