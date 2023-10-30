//Questão 2 : Faça um programa usando a linguagem Java que receba o número de termos n de Fibonacci e
//        retorne os n termos da sequência de Fibonacci. O cálculo dos termos de Fibonacci devem ser feitos dentro
//        de uma sub-rotina.

import java.util.Scanner;

public class Questao02 {

    public static void fibonacci(int num){
        int anterior = 0;
        int atual = 1;

        System.out.println("A sequência de Fibonacci para " + num + " termos é:");
        System.out.println(anterior);

        for (int i = 1; i < num; i++) {
            System.out.println(atual);
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de termos desejado:");
        int termos = scan.nextInt();

        scan.close();

        fibonacci(termos);


    }
}
