package EstruturaRepeticacao;
/* Faça um programa que peça uma nota, entre 0 e 10. Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Entre com a nota do aluno: ");
            int nota = scanner.nextInt();

            if (nota <0 || nota > 10){
                System.out.println("Valor inválido.");
            }
            else {
                System.out.println("Nota do aluno é = " + nota);
                break;
            }
        }
        scanner.close();
       

        

        
    }
}
