
package Aula04_Ex05_DispositivosEletronicos;

public class Notebook extends DispositivoEletronico {
    
    protected int armazenamento;

    public Notebook(String marca, String modelo, int armazenamento) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
    }

   
}
