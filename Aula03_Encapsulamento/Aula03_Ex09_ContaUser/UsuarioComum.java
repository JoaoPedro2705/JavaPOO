
package Aula03_Ex09_ContaUser;

public class UsuarioComum implements ContaUsuario{
    private String nome;

    public UsuarioComum(String nome) {
        this.nome = nome;
    }
    
    

    @Override
    public void acessarSistema() {
        System.out.println("Usuario "+ nome + " acessou o sistema. ");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Acesso negado: apenas administradores podem realizar operações. ");
    }
    
}
