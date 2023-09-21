//Faça um programa que calcule e mostre a área de um círculo.
//Nota: sabe-se que a área é A = π * r^2


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        double raio;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        raio = scan.nextFloat();

        double area = 3.1415 * (raio * raio);

        System.out.printf("A área do círculo de raio é: %f" ,area);



    }



}
