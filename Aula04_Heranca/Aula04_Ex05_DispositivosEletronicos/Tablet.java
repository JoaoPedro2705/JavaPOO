
package Aula04_Ex05_DispositivosEletronicos;

public class Tablet extends DispositivoEletronico {
    
    protected double tamanhoTela;

    public Tablet(String marca, String modelo, double tamanhoTela) {
        super(marca, modelo);
        this.tamanhoTela = tamanhoTela;
    }
    
    
}
