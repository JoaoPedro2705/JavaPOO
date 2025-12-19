
package Aula02_Ex05_Produto;

public class main {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Nike Air Max Plus",500.00,10);
        
        System.out.println("Comprando em quantidade, [3], dentro do quem no estoque :");
        p1.comprar(3);
        System.out.println("Estoque atual: "+ p1.getQuantidadeEstoque());
        
        System.out.println();
        System.out.println();
        System.out.println("Comprando a mais do que tem no estoque :");
        
        p1.comprar(11);
    }
}

    

