package MetodoCriacao;
public class Ex1Criacao {
   
// 1. Calcule as 4 operações básicas: soma, subtração, divisão e multiplicação. Sempre passando 2 valores.
    
    public static void soma(int valorA, int valorB) {
        int resultado = valorA + valorB;
        System.out.println("O valor da soma de " + valorA + " + " + valorB + " é igual = " + resultado );
    }

    public static void subtracao(int valorA, int valorB) {
        int resultado = valorA - valorB;
        System.out.println("O valor da subtração de " + valorA + " - " + valorB + " é igual = " + resultado );
    }

    public static void multiplicacao(int valorA, int valorB) {
        int resultado = valorA * valorB;
        System.out.println("O valor da multiplicação de " + valorA + " x " + valorB + " é igual = " + resultado );
    }

    public static void divisao(int valorA, int valorB) {
        int resultado = valorA / valorB;
        System.out.println("O valor da divisão de " + valorA + " por " + valorB + " é igual = " + resultado );
    }

    public static void main(String[] args) {
        System.out.println("Resultado do Exercício 1 (Métodos)");
        Ex1Criacao.soma(10, 5);
        Ex1Criacao.subtracao(10, 5);
        Ex1Criacao.multiplicacao(10, 5);
        Ex1Criacao.divisao(10, 5);
    }

  
}    

    
     
        

