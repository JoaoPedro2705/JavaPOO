
package Aula03_Ex09_ContaUser;

public class main {
    public static void main(String[] args) {
        Adm a1 = new Adm("Gisele");
        UsuarioComum uc1 = new UsuarioComum("Nicolas");
        
        a1.acessarSistema();
        a1.realizarOperacao();
        
        System.out.println();
        
        uc1.acessarSistema();
        uc1.realizarOperacao();
        
    }
}
