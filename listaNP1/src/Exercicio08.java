//Um programa para gerenciar os saques de um caixa eletrônico deve possuir algum mecanismo
//para decidir o número de notas de cada valor que deve ser disponibilizado para o cliente que realizou o
//saque. Um possível critério seria o da “distribuição ótima” no sentido de que as notas de menor valor sejam
//distribuídas em número mínimo possível. Escreva um programa que leia o valor da quantia solicitada e
//imprima na tela a distribuição das notas de acordo com o critério acima.
//Considere apenas a existência das notas de R$50, R$10, R$5 e R$1 no caixa eletrônico.
//Exemplo: Ao digitar R$87, a impressão deve mostrar:
//   Nota50 = 1
//   Nota10 = 3
//   Nota5 = 1
//   Nota1 = 2

import java.util.Scanner;
public class Exercicio08 {

    public static void main(String[] args) {

        int valorSaque;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do saque:");
        valorSaque = scan.nextInt();

        int nota50 = valorSaque / 50;
        valorSaque = valorSaque % 50;

        int nota10 = valorSaque / 10;
        valorSaque = valorSaque % 10;

        int nota5 = valorSaque / 5;
        valorSaque = valorSaque % 5;

        int nota1 = valorSaque;

        System.out.println("Notas 50 = " + nota50);
        System.out.println("Notas 10 = " + nota10);
        System.out.println("Notas 5 = " + nota5);
        System.out.println("Notas 1 = " + nota1);
    }
}
