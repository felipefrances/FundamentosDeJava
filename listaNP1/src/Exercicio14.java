//Faça um programa que leia um valor digitado e calcule o fatorial deste número.

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, fatorial =1;

        System.out.println("Digite um número inteiro: ");
        num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial do número " + num + " é: " + fatorial);
    }
}
