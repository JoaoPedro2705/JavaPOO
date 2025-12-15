
package Aula04_Ex01_Midias;

public class main {
    public static void main(String[] args) {
        
        Musica m1 = new Musica("Wake Up in the Sky",4,"Bruno Mars","Saint");
        Filme f1 = new Filme("Scarface",170,"Brian De Palma","Drama policial");
        Jogo j1 = new Jogo("Watch Dogs 2",1080,"Multiplataforma","+18");
        
        System.out.println("Midias Favoritas do USER: ");
        System.out.println();
        System.out.println("Musica: ");
        System.out.println(m1.getTitulo() + " - " + m1.getArtista());
        System.out.println();
        System.out.println("Filme: ");
        System.out.println(f1.getTitulo() + " - " + f1.getGenero());
        System.out.println();
        System.out.println("Jogo: ");
        System.out.println(j1.getTitulo() + " - " + j1.getPlataforma());
    }
}
