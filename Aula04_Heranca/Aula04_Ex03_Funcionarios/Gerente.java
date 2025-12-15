
package Aula04_Ex03_Funcionarios;

public class Gerente extends Funcionario {
    
    private String departamento;

    public Gerente(String nome, String cargo, double salario, String departamento) {
        super(nome, cargo, salario);
        this.departamento = departamento;
    }
    
    
    }
    

