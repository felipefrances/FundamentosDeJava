import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a 1ª nota do aluno:");
        nota1 = scan.nextDouble();
        System.out.println("Digite a 2ª nota do aluno");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Aluno aprovado. Média = " + media);
        } else if (media >= 4) {
            System.out.println("Aluno está de 'Final'. Média = " + media);
        } else {
            System.out.println("Aluno Reprovado. Média = " + media);

        }
    }
}
