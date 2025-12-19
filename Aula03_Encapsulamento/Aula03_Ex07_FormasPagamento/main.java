package Aula03_Ex07_FormasPagamento;

public class main {

    public static void main(String[] args) {
        CartaoCredito cc1 = new CartaoCredito();
        Boleto b1 = new Boleto();
        Dinheiro d1 = new Dinheiro();
        
        System.out.println("Efetuando Pagamento com Cartão de credito: ");
        cc1.efetuarPagamento(450.00);
        System.out.println();
        
        System.out.println("Efetuando Pagamento com Boleto: ");
        b1.efetuarPagamento(200.00);
        System.out.println();
        
        System.out.println("Efetuando Pagamento com Dinheiro: ");
        d1.efetuarPagamento(50);
        
    }

}
