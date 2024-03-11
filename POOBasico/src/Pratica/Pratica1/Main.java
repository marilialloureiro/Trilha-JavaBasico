package Pratica.Pratica1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        //Passar informações para o construtor Carro () - set

        carro.setCor("branco");
        carro.setModelo("Pegeout 308");
        carro.setCapacidadeTanque(45);

        //Apresentar as informações - get

        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.calcularValorTotal(5.89));

        Carro carro2 = new Carro("Vermelho", "Jeep", 65); //Utilizando sobrecarga no construtor

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.calcularValorTotal(6.89));


    }
}
