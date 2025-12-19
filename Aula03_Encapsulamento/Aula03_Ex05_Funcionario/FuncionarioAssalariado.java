package Aula03_Ex05_Funcionario;

public class FuncionarioAssalariado implements Pagavel {
    private double salarioMensal;

    public FuncionarioAssalariado(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }
    
}
