package Aula01_Ex08_Aluno;

public class Aluno {

    String nome;
    int matricula;
    double[] notas;

    double calcularMedia() {
        if (notas.length == 0) {
            return 0.0;

        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
