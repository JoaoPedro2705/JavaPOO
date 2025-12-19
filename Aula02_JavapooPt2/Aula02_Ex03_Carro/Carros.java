package Aula02_Ex03_Carro;

public class Carros {
    private String marca, modelo;
    private int ano;
    private boolean ligado;
    
    public Carros (String m, String md, int a, boolean l) {
        this.marca = m;
        this.modelo = md;
        this.ano = a;
        this.ligado = l;
    }
          
    void ligar (){
        if(ligado)
        this.ligado = false;
        System.out.println("Aperte o cinto, o veiculo está ligado. ");
    }
    
    void desligar (){
        if(!ligado)
        this.ligado = true;
        System.out.println("Não esqueça da chave, o veiculo está desligado. ");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
           
}
