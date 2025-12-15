
package Aula04_Ex02_Eventos;

public class main {
    public static void main(String[] args) {
        
        Show s1 = new Show ("Rock in Rio","14/10/2026","Sabrina Carpenter");
        Palestra p1 = new Palestra("Dinheiro com Propósito","03/11/2026","Janete Dias");
        Workshop w1 = new Workshop("Programando IAS","08/12/2026","Henrique Silva");
        
        System.out.println(" Eventos Marcados na Sua Agenda: ");
        System.out.println();
        System.out.println(s1.nome + " - " + s1.data);
        System.out.println(p1.nome + " - " + p1.data);
        System.out.println(w1.nome + " - " + w1.data);
        
        
    }
}
