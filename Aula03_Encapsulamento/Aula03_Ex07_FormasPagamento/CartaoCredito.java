
package Aula03_Ex07_FormasPagamento;

public class CartaoCredito implements FormaPagamento {

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Valor de compra: R$ "+ valor);
        System.out.println("Aproxime ou insira o cartão. ");
        System.out.println("Pagamento com cartão aprovada.");
    }
    
}
