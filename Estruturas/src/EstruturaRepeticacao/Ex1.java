/*Faça um programa que leia um conjunto de dois valores, o primeiro repesentando o nome do aluno
 * e o segundo representando a sua idade. Pare o programa inserindo o valor 0 no campo nome
*/

package EstruturaRepeticacao;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        

        while (true) {

            System.out.println("Nome: ");
            nome = scanner.next();
            if (nome.equals("0")){
                System.out.println("Programa encerrado!");
                break;
            }
              
         
            System.out.println("Idade: ");
            idade = scanner.nextInt();
           
        } 
        scanner.close();
       
    }
}