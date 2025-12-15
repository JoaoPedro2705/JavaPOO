
package Aula04_Ex03_Funcionarios;

public class main {
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente("Kassia","Gerente",9000,"TI");
        Vendedor v1 = new Vendedor("Nicolas","Vendedor",2500,0.50);
        Desenvolvedor d1 = new Desenvolvedor("Alissom","Desenvolvedor",6500,"Python");
        
        System.out.println(g1.nome + " - " + g1.cargo);
        System.out.println(v1.nome + " - Comissão: " + v1.comissao);
        System.out.println(d1.nome + " - Linguagem: " + d1.getLinguagemProgramar());
    
    }    
}
