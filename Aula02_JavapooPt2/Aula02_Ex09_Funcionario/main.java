package Aula02_Ex09_Funcionario;

public class main {

    public static void main(String[] args) {

        Funcionario fc1 = new Funcionario("Gabriela", "RH", 4200.00);

        System.out.println("Informações do Funcionario :");
        System.out.println("Nome: " + fc1.getNome());
        System.out.println("Departamento: " + fc1.getDepartamento());
        System.out.println("Salario atual: " + fc1.getSalario());
        System.out.println("");
        fc1.aumentarSalario(10);
        System.out.println("Salario após aumento: " + fc1.getSalario());

    }
}
