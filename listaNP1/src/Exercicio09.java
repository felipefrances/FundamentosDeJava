//Faça um programa que leia o salário de um trabalhador e o valor da prestação de um
//empréstimo.
//Se a prestação for maior que 20% do salário imprima: Empréstimo não concedido.
//Caso contrário imprima: Empréstimo concedido.


import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        float salario, parcela;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        salario = scan.nextFloat();

        System.out.println("Digite a prestação do empréstimo: ");
        parcela = scan.nextFloat();

        if(parcela > salario * 0.2){
            System.out.println("Empréstimo não concedido.");
        }
        else {
            System.out.println("Empréstimo concedido.");
        }
    }
}
