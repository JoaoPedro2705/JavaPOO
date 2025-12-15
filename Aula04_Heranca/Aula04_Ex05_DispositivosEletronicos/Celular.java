
package Aula04_Ex05_DispositivosEletronicos;

public class Celular extends DispositivoEletronico{
    protected double tamanhoTela;

    public Celular(String marca, String modelo, double tamanhoTela) {
        super(marca, modelo);
        this.tamanhoTela = tamanhoTela;
    }
    
    
}
