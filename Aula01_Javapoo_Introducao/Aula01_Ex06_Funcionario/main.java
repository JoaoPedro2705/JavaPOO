
package Aula01_Ex06_Funcionario;

public class main {
    public static void main(String[] args) {
        Funcionario fc1 = new Funcionario();
        fc1.nome = "Agatha";
        fc1.departamento = "Marketing";
        fc1.salario = 2500.00;
        System.out.println("Informações do Funcionario");
        System.out.println();
        System.out.println("Nome: "+fc1.nome);
        System.out.println("Departamento: "+fc1.departamento);
        System.out.println("Salario atual: "+fc1.salario);
        fc1.aumentarSalario(5);
        System.out.println("Novo Salario: "+fc1.salario);
        
    }
}
