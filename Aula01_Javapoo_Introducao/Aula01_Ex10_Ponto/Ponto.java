
package Aula01_Ex10_Ponto;

public class Ponto {
    int x, y;
    
    double calcularDistancia(Ponto outroPonto){
        int deltaX = x - outroPonto.x;
        int deltaY = y - outroPonto.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        
     
    }
}
