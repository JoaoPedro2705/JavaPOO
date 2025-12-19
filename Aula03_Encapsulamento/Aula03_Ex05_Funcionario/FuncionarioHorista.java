package Aula03_Ex05_Funcionario;

public class FuncionarioHorista implements Pagavel{
    private double valorHora;
    private double horasTrabalhadas;

    public FuncionarioHorista(double valorHora, double horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento() {
        return  valorHora * horasTrabalhadas;
    }
    
    
}
