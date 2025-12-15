
package Aula04_Ex03_Funcionarios;

public class Vendedor extends Funcionario {
    
    double comissao;

    public Vendedor(String nome, String cargo, double salario, double comissao) {
        super(nome, cargo, salario);
        this.comissao = comissao;
    }
}
