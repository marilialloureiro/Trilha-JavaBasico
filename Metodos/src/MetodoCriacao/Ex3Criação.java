package MetodoCriacao;
public class Ex3Criação {
    // 3. Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influencia. 
    // Defina arbitrariamente as faixas que influenciam nos valores.*/

    public static double getDuasParcelas() {
       return 2;
    }

    public static double getTresParcelas() {
        return 3;
     }
    
    public static double getTaxaDuasParcelas() {
        return 0.3;
     }

     public static double getTaxaTresParcelas() {
        return 0.45;
     }

     public static void calcular (double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        }
        else if (parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor final do empréstimo para 3 parcelar: R$ " + valorFinal);
        }
        else {
            System.out.println("Quantidade de parcelas não aceitas");
        }
    }

    public static void main(String[] args) {
        Ex3Criação.calcular(1000, 2);
        Ex3Criação.calcular(1000, 3);
        Ex3Criação.calcular(1000, 5);
    }

}

