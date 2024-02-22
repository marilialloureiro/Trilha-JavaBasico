package EstruturaRepeticacao;

import java.util.Scanner;

/* Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números ímpares */

public class Ex4 {
    public static void main(String[] args) {
        
        int pares = 0, impares =0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Com quantos números fará a entrada de dados:");
            int qtdNumeros = scanner.nextInt();

        do{
            System.out.println("Entre com um número: ");
            int num = scanner.nextInt();
            count++;

            if (num % 2 == 0){
                pares++;
            }else impares++;

        }while(count < qtdNumeros);

        System.out.println("A quantidade de números pares digitados é igual a: " + pares);
        System.out.println("A quantidade de números ímpares digitados é igual a: " + impares);

    }
}
