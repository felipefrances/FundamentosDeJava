//Faça um programa para calcular a média aritmética M entre duas notas de um aluno
//e mostrar sua situação, que pode ser Aprovado (M >= 7), Reprovado (M < 4) e Final (4 <= M < 7).
//Se o aluno ficar de Final, entre com a nota da prova Final e mostre a média e o resultado final.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota1, nota2;

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = scan.nextInt();

        float media = (nota1 + nota2) /2;

        if(media >= 7.0){
            System.out.println("Aluno Aprovado.");
        }
        else if (media < 4.0){
            System.out.println("Aluno Reprovado.");
        }
        else {
            System.out.println("Digite a nota da prova final: ");
            float notaFinal = scan.nextFloat();

           System.out.println("Media do aluno: " +media);
           System.out.println("Resultado da prova final: " +notaFinal);
            }
        }


    }
