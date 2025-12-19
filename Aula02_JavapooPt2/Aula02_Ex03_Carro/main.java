package Aula02_Ex03_Carro;

public class main {
    public static void main(String[] args) {
        Carros c1 = new Carros("Honda", "Civic", 2020, true);
        
        System.out.println("\nInformações do Veiculo : ");
        System.out.println("Marca: "+ c1.getMarca());
        System.out.println("Modelo do Carro: "+ c1.getModelo());
        System.out.println("Ano do Carro: " + c1.getAno());
        System.out.println("");
        
        System.out.println("Ligando veiculo: ");
       c1.ligar();
   
       
        System.out.println();
        System.out.println("Desligando veiculo: ");
       c1.desligar();
        
    }
}
