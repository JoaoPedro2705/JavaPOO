
package Aula01_Ex06_Funcionario;

public class Funcionario {
    String nome, departamento;
    double salario;
    
    void aumentarSalario(double percentual){
        salario += salario * (percentual / 10);
    }
}
