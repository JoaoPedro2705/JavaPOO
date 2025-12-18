package Aula01_Ex09_Produto;

public class main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Camiseta";
        produto1.preco = 39.90;
        produto1.quantidadeEmEstoque = 50;
        produto1.vender(10);
        produto1.reporEstoque(20); 
    }
}
