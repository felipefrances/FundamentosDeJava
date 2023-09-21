//Faça um programa que calcule as raízes da equaçãao de 2o grau.
// (a) Lembre-se que: x = (−b ± √∆)/2 * a, onde ∆ = b**2– 4 * a * c
// (b) E a * x ** 2 + b * x + c = 0 representa uma equação do 2o grau.
//A variável ’a’ tem que ser diferente de zero.
//Caso seja igual, imprima a mensagem “Não é equação do segundo grau”.
//Se ∆ < 0, não existe real. Imprima a mensagem “Não existe raiz”.
//Se ∆ = 0, existe uma raiz real. Imprima a raiz e a mensagem Raiz Unica.
//Se ∆ ´ >= 0, imprima as duas raízes.

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        int a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.println("Considerando a equação ax² + bx + c = 0.");
        System.out.println("Digite um valor para a: ");
        a = scan.nextInt();
        System.out.println("Digite um valor para b: ");
        b = scan.nextInt();
        System.out.println("Digite um valor para c: ");
        c = scan.nextInt();

        int delta = (b * b) - (4 * a * c);
        int x1 = (int) (a * (-b + Math.sqrt(delta)) /2);
        int x2 = (int) (a * (b + Math.sqrt(delta)) / 2);

        if (a == 0){
            System.out.println("Esta não é uma equação de 2º Grau.");
        }
        else if(delta < 0){
            System.out.println("Não existe raiz real");
        }
        else if (delta == 0) {
            System.out.println("A equação possui apenas uma raiz.");
            System.out.println(" x = ." +x1);
        }
        else {
            System.out.printf(" As raízes da equação de 2º grau são x1 = %d e x2 = %d", x1, x2);
        }


    }
}
