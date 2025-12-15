
package Aula04_Ex03_Funcionarios;

public class Desenvolvedor extends Funcionario{
    
    private String linguagemProgramar;

    public Desenvolvedor(String nome, String cargo, double salario, String linguagemProgramar) {
        super(nome, cargo, salario);
        this.linguagemProgramar = linguagemProgramar;
        
        
    }

    public String getLinguagemProgramar() {
        return linguagemProgramar;
    }

    public void setLinguagemProgramar(String linguagemProgramar) {
        this.linguagemProgramar = linguagemProgramar;
    }
}
