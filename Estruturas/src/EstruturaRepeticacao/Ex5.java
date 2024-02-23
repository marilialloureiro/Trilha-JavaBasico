package EstruturaRepeticacao;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada cabaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deverá informar qual número ele deseja ver a tabuada.
*/

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        while (true) {
            System.out.println("Informe qual tabuada deseja realizar ou digite 0 para encerrar: ");
            int valorTabuada = scanner.nextInt();
                if (valorTabuada == 0){
                    System.out.println("Programa encerrado.");
                    break;
                }
                
            
            int num;
            for (num = 1; num <=10 ; num++){
                System.out.println(valorTabuada + " x " + num + " = " + (valorTabuada*num));
    
            }
    
        }
        scanner.close();
    }
}
