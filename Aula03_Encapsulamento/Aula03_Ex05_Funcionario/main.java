package Aula03_Ex05_Funcionario;

public class main {
    public static void main(String[] args) {
        FuncionarioHorista fh1 = new FuncionarioHorista (20, 4);
        FuncionarioAssalariado fa2 = new FuncionarioAssalariado (2500);
    
        
        System.out.println("-- SALARIOS DO SETOR MARKETING --");
        System.out.println();
        System.out.println("Salario do Film Maker (Horista) : R$"+ fh1.calcularPagamento()+" por Dia. ");
        System.out.println();
        System.out.println("Salario do Editor (Assalariado) : R$"+fa2.calcularPagamento()+" por mês.  ");
        
    
    
    }
}
