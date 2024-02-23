package Arrays;

import java.util.Scanner;

/* Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes. */

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String [6];
        String[] vogais = {"A", "E", "I", "O", "U"};

        int quantidadeConsoantes = 0;
        int count=0;

        do{
            System.out.println("Entre com os caracteres: ");
            String caracteres = scanner.next();

            boolean caracteresSaoConsoantes = true;
            for (String vogal:vogais){
                if (caracteres.equalsIgnoreCase(vogal)){
                    caracteresSaoConsoantes = false;
                    break;
                 }
            }

            if (caracteresSaoConsoantes) {
                consoantes[quantidadeConsoantes] = caracteres;
                quantidadeConsoantes++;
            }

            count++;
        }while(count < 6);

        System.out.println("Consoantes lidas:");
        for (int i = 0; i < quantidadeConsoantes; i++) {
            System.out.println(consoantes[i]);
        }

        System.out.println("Total de consoantes: " + quantidadeConsoantes);

        scanner.close();
    }
    
}
