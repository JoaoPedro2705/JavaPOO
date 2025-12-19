
package Aula03_Ex10_Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(9);
        numeros.add(3);

        Ordenacao<Integer> crescente = new OrdenacaoCrescente<>();
        Ordenacao<Integer> decrescente = new OrdenacaoDescrescente<>();

        crescente.ordenar(numeros);
        System.out.println("Crescente: " + numeros);

        decrescente.ordenar(numeros);
        System.out.println("Decrescente: " + numeros);
    }
}

    
 

