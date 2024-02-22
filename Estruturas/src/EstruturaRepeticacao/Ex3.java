package EstruturaRepeticacao;

import java.util.Scanner;

/* Faça um programa que leia 5 números e informe o maior número e sua média. */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        soma = soma + num;

        

        if (num > maior) maior = num;
        count ++;

        } while(count < 5);
        
        System.out.println("O maior número digitado é: " + maior );
        System.out.println("A média dos valores é: " + soma/5 );


        }
 }
