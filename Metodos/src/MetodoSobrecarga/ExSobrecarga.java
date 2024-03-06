package MetodoSobrecarga;

public class ExSobrecarga {
    //Crie uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio

    public static void calcularQuadrado(double valorLado){
        double areaQuadrado = valorLado * valorLado;
        System.out.println("A área do quadrado é: " + areaQuadrado);
    }

    public static void calcularRetangulo(double valorLado1, double valorLado2){
        double areaRetangulo = valorLado1 * valorLado2;
        System.out.println("A área do quadrado é: " + areaRetangulo);
    }

    public static void calcularTrapezio(double baseMaior, double baseMenor, double altura){
        double areaTrapezio = ((baseMaior + baseMenor)*altura)/2;
        System.out.println("A área do quadrado é: " + areaTrapezio);
    }

    public static void main(String[] args) {
        ExSobrecarga.calcularQuadrado(5);
        ExSobrecarga.calcularRetangulo(5, 3);
        ExSobrecarga.calcularTrapezio(7, 8, 9 );
    }
}
