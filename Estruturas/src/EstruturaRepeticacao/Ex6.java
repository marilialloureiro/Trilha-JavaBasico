package EstruturaRepeticacao;
/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Digite o número para calculo do fatorial ou 0 para sair: ");
            int num = scanner.nextInt();
                if (num == 0){
                    System.out.println("Programa encerrado");
                    break;
                }

            int multiplicacao = 1;
            for (int i = num; i >= 1; i--){
                
                multiplicacao = multiplicacao * i; 
            }
            System.out.println("O fatorial de " + num + " é: " + multiplicacao);
        }
        scanner.close();
    }
}
