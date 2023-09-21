import java.util.Scanner;

//Faça um programa que apresente um menu de opções para cálculo das seguintes operações
//entre dois números:
//(a) Adição (opção 1)
//(b) Subtração (opção 2)
//(c) Multiplicação (opção 3)
//(d) Divisão (opção 4)
//(e) Saída (opção 5)
//O programa deve possibilitar ao usuário a escolha da operação desejada e a exibição do resultado
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float num1, num2, resultado =0;
        int op;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextFloat();
        System.out.println("Digite o segundo número: ");
        num2 = scan.nextFloat();

        System.out.println("""
                Escolha a operação.
                Adição (opção 1)
                Subtração (opção 2)
                Multiplicação (opção 3)
                Divisão (opção 4)
                
                Digite a opção para a operação escolhida ou pressione 5 para sair:
                """);
        op = scan.nextInt();

        switch(op){
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            case 5:
                return;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("Resultado da operação escolhida entre " + num1 + " e " + num2 + " é: " + resultado);
    }
}

