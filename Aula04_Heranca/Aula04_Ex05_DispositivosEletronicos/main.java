package Aula04_Ex05_DispositivosEletronicos;

public class main {

    public static void main(String[] args) {

        Celular c1 = new Celular("Iphone", "13 Pro Max", 6.7);
        Tablet t1 = new Tablet("Samsung", "Tab S6", 10.4);
        Notebook n1 = new Notebook("Lenovo", "LOQ E", 512);

        System.out.println("## ELETRONICOS ##");
        System.out.println();
        System.out.println("Celular: " + c1.marca + " " + c1.modelo + " - Tela: "
                + c1.tamanhoTela + " polegadas");
        System.out.println();
        System.out.println("Tablet: " + t1.marca + " " + t1.modelo + " - Tela: " + t1.tamanhoTela
                + " polegadas");
        System.out.println();
        System.out.println("Noteboo: " + n1.marca + " " + n1.modelo + " - Armazenamento: "
                + n1.armazenamento + " GB");

    }
}
