//Questão 9: Faça um programa em Java que receba uma senha (valor numérico). O programa deve tratar
//        a exceção de entrada inválida. Nota: a exceção lançada é InputMismatchException.


import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua senha numérica: ");
        try{
            int senha = scan.nextInt();
        } catch(InputMismatchException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim");
        }
    }

}
