public class Operadores {
    public static void main(String[] args) {

        String nomeCompleto= "Marília" + " Loureiro";
        System.out.println(nomeCompleto);

        int num1 = 10;
        int num2 = 5;

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = num1/num2;

        System.out.println("Resultado da soma = " + soma);
        System.out.println("Resultado da subtração = " + subtracao);
        System.out.println("Resultado da multiplicação = " + multiplicacao);
        System.out.println("Resultado da divisão = " + divisao);

        //incrementos / decrementos> repetição

        int numero = 20;
        numero ++;
        System.out.println(numero);

        numero --;
        System.out.println(numero);

        numero +=20;
        System.out.println(numero);

        //invertendo valor de variável booleana
        boolean variavel = true;

        variavel = !variavel; //insere !
        System.out.println(variavel);

        //OPERADOR TERNARIO (simula o 'if')

        int a,b;
        a = 10;
        b = 10;

        String resultado = a==b ? "verdadeiro" : "falso"; // operação ? "V" : "F"
        System.out.println(resultado);

        //RELACIONAIS

        int valor1 = 10;
        int valor2 = 5;

        boolean simNao = valor1 == valor2;

        System.out.println("O valor 1 é = ao valor 2? " + simNao);
        simNao = valor1 != valor2;
        System.out.println("O valor 1 é DIFERENTE ao valor 2? " + simNao);
        simNao = valor1 > valor2;
        System.out.println("O valor 1 é MAIOR ao valor 2? " + simNao);
        simNao = valor1 < valor2;
        System.out.println("O valor 1 é MENOR ao valor 2? " + simNao);
        simNao = valor1 >= valor2;
        System.out.println("O valor 1 é MAIOR OU IGUAL ao valor 2? " + simNao);

        //comprando textos > IDEAL É USAL O EQUALS
        String nome1 = "Marilia";
        String nome2 = "Mariana";
        System.out.println(nome1 == nome2); //é incorreto fazer dessa forma
        System.out.println(nome1.equals(nome2)); //correto é utilizar .equals


    }
    
}
