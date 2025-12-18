
package Aula01_Ex01_Pessoa;

public class main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João X-man";
        pessoa1.idade = 20;
        pessoa1.altura = 1.78;
        pessoa1.apresentar();
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Tamara Vieira";
        pessoa2.idade = 35;
        pessoa2.altura = 1.58;
        pessoa2.apresentar();
        
    }
}
