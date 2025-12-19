
package Aula02_Ex05_Produto;

public class Produto {
  private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
 
 public void comprar(int qtd){
     if(qtd <= quantidadeEstoque){
         quantidadeEstoque -= qtd;
         System.out.println("Compra de "+qtd +" "+nome+ " Realizada com Sucesso.");
     }else{
         System.out.println("Quantidade insuficiente no estoque.");
     }
 }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}

    
    
    

