package Aula03_Ex02_Animal;

public class main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro ("Nico");
        Passaro p1 = new Passaro ("Ben");
        Gato g1 = new Gato ("Lily");
        
        System.out.println("--- Pets Looney ---");
        System.out.println("");
        System.out.println("- Animais que estão no consultório -");
        System.out.println("");
        c1.nomeAnimal();
        p1.nomeAnimal();
        g1.nomeAnimal();
        
        System.out.println("");
        System.out.println("- Som deles -");
        System.out.println("\nCachorro: ");
        c1.emitirSom();
        System.out.println("\nPassaro: ");
        p1.emitirSom();
        System.out.println("\nGato :");
        g1.emitirSom();
        
        System.out.println("");
    }
}
