//Faca um programa que leia um numero e, caso seja positivo, calcule e mostre:
//        (a) O quadrado do numero digitado
//        (b) A raiz quadrada do numero

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        float numPositivo;
        float numQuadrado;
        float raizQuadrada;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");
        numPositivo = scan.nextFloat();

        if(numPositivo >= 0){

            numQuadrado = numPositivo * numPositivo;
            raizQuadrada = (float)Math.sqrt(numPositivo);

            System.out.println("O quadrado do número escolhido é: " + numQuadrado);
            System.out.println("A raiz quadrada do número escolhido é:" + raizQuadrada);

        }
        else{
            System.out.println("O número digitado não é positivo.");
        }
    }

}

