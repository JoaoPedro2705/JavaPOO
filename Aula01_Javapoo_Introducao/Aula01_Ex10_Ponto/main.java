package Aula01_Ex10_Ponto;

public interface main {

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        ponto1.x = 1;
        ponto1.y = 3;

        Ponto ponto2 = new Ponto();
        ponto2.x = 4;
        ponto2.y = 6;

        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("A distancia entre os pontos é : " + distancia);
    }
}
