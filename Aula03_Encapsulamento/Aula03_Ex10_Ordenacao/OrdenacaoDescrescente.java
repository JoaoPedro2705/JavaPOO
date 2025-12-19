
package Aula03_Ex10_Ordenacao;

import java.util.Collections;
import java.util.List;


public class OrdenacaoDescrescente<T extends Comparable <T>> implements Ordenacao<T> {

    @Override
    public void ordenar(List<T> lista) {
        Collections.sort(lista, Collections.reverseOrder());
    }
    
}
