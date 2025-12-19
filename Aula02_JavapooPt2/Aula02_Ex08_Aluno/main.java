
package Aula02_Ex08_Aluno;

public class main {
    public static void main(String[] args) {
        double[] notas = {7.5,8.5,6.0,9.5};
        
        Aluno a1 = new Aluno ("Breno","1234567",notas);
        
        System.out.println("Boletim do aluno: ");
        System.out.println("Aluno: "+a1.getNome());
        System.out.println("Matricula: "+a1.getMatricula());
        System.out.println("Media: "+a1.calcularMedia());
    }
}
