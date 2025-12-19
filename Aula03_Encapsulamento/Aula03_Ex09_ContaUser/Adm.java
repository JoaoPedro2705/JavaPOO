
package Aula03_Ex09_ContaUser;

public class Adm implements ContaUsuario {
    private String nome;

    public Adm(String nome) {
        this.nome = nome;
    }

    @Override
    public void acessarSistema() {
        System.out.println("Administrador "+ nome + " acessou o sistema. ");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Operação realizada com sucesso pelo Administrador. ");
    }
    
    
    
}
