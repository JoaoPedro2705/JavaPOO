
package Aula03_Ex07_FormasPagamento;

public class Dinheiro implements FormaPagamento{

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Valor de compra: R$ "+valor);
        System.out.println("Cliente vai precisar de troco?");
        System.out.println("Pagamento no dinheiro aprovado, pegue seu troco. ");
    }
    
}
