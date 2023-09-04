/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals;

import java.util.Scanner;

/**
 *
 * @author felipefrances
 */
public class GradeVerify {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota1, nota2, media;

        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = scan.nextFloat();

        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = scan.nextFloat();
      
          
             media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.print("Aluno Aprovado");
        } else if (media < 4.0) {
            System.out.print("Aluno Reprovado");
        } else {
            System.out.print("Aluno esta de prova final");
            System.out.print("\n");
       
            float notaFinal;
            System.out.print("Digite a nota da prova final do aluno: ");
            notaFinal = scan.nextFloat();

            if (notaFinal >= 5.0) {
                System.out.print("Aluno Aprovado");
            } else if (notaFinal < 5.0) {
                System.out.print("Aluno Reprovado");
            }
        }

    }
}
