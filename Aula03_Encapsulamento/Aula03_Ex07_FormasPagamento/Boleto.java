
package Aula03_Ex07_FormasPagamento;


public class Boleto implements FormaPagamento {

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$ "+valor);
        System.out.println("Aguardando pagamento do boleto. ");
        System.out.println("Pagamento do Boleto aprovado.");
        
    }
    
}
