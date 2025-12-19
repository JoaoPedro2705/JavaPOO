
package Aula03_Ex10_Ordenacao;
import java.util.List;

public interface Ordenacao<T extends Comparable<T>>{
    
    void ordenar(List<T> lista);
    
}
