package Return;

public class Retorno {
    //Entendendo o return nos métodos
    // Utilizando sobrecarga de método, crie uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.

    public static double calcularQuadrado(double valorLado){
        return valorLado * valorLado;
    }

    public static double calcularRetangulo(double valorLado1, double valorLado2){
        return valorLado1 * valorLado2;
    }

    public static double calcularTrapezio(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor)*altura)/2;
    }

    public static void main(String[] args) {

        double areaQuadrado = Retorno.calcularQuadrado(5);
        System.out.println("A área do quadrado é: " + areaQuadrado);

        double areaRetangulo = Retorno.calcularRetangulo(5,3);
        System.out.println("A área do retângulo é: " + areaRetangulo);

        double areaTrapezio = Retorno.calcularTrapezio(7,5,3);
        System.out.println("A área do trapézio é: " + areaTrapezio);
    }

}
