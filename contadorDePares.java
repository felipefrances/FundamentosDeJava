//Faça um algoritmo que leia um vetor de 10 posições;
//Conte e mostre quantos valores ele possui.

package javafundamentals;

import java.util.Scanner;

public class contadorDePares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array =  new int[10];
        int contPar = 0;


        for(int i = 0; i <= 9; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            array[i] = scan.nextInt();
            if (array[i] % 2 == 0) {
                contPar++;
            }

        }
        System.out.println("Quantidade de pares digitados: " + contPar);
        scan.close();

    }

}

