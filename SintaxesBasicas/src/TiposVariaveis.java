public class TiposVariaveis {
    public static void main(String[] args)  {
        System.out.println("Compreendendo tipos variáveis");
        
        //tipos primitivos

        double salarioMinimo = 2500; //. representa vírgula
        double peso = 62.3;
        char sexo = 'F';
        boolean doadorOrgao = true;
        float altura = 1.60F; // float dever incluir a letra F no final
        int idade = 30;
        short numeroCurto = 1;
        long numeroLongo = 123456789L; //deve incluir a letra L no final

        int numTeste = 5;
        numTeste = 10;
        System.out.println("Testando a mudança de valor na variável: " + numTeste);

        final double VALOR_DE_PI = 3.14; //variável deve ser escrita em caixa alta
        /*VALOR_DE_PI = 10.75;*/ //está com erro pois a palavra "final" na variável PI, representa que não pode ser alterado o valor

        String meuNome = "Marília Loureiro";
    }
}
