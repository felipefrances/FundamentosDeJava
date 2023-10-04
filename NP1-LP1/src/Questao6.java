import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota1, nota2;

        System.out.println("Digite a nota da prova 1 do aluno:");
        nota1 = scan.nextFloat();

        System.out.println("Digite a nota da prova 2 do aluno: ");
        nota2 = scan.nextFloat();

        float media = (nota1 + nota2) / 2;

        if(media >= 7.0){
            System.out.println("Aluno Aprovado.");
        }
        else if (media < 4.0){
            System.out.println("Aluno Reprovado.");
        }
        else{
            System.out.println("Aluno está de prova Final.");
        }
    }
}
