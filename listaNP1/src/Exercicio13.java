//Faça um programa que mostre os N termos da sequência de Fibonacci: 0-1-1-2-3-5-8-13-21-
//34-...
//(a) Note: N é a quantidade de termos dados pelo usuário.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de termos desejado:");
        int termos = scan.nextInt();

        int anterior = 0;
        int atual = 1;

        System.out.println("A sequência de Fibonacci para " + termos + " termos é:");
        System.out.println(anterior);

        for (int i = 1; i < termos; i++) {
            System.out.println(atual);
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
