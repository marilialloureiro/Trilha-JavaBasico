import java.util.Scanner;

public class EstruturaCondicionais2 {

    /*1. Com o uso do switch, use String para a partir do dia da semana exibir seu número.
     *2. Faça outro exemplo, onde, se uma variável inteira for entre 1 e 3, exibir o texto "certo", se for 4 exibir "errado" e se for 5 "talvez".
     Para os demais valores, exibir "valor indefinido" 
     */

     @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana para exibir seu número: ");
        String diaSemana = scanner.next();

        switch (diaSemana) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(8);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
        

        System.out.println("2. Faça outro exemplo, onde, se uma variável inteira for entre 1 e 3, exibir o texto \"certo\", se for 4 exibir \"errado\" e se for 5 \"talvez\".\r\n" + //
                        "Para os demais valores, exibir \"valor indefinido");

        int num = scanner.nextInt();

        switch (num){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
            default:
                System.out.println("Valor indefinido");
                break;
        }
     }
}
