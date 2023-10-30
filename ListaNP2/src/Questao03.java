//Questaoo 3: Faça um programa usando a linguagem de programação Java que apresente uma calculadora
//        para duas entradas de valores. O programa deve apresentar um menu com quatro operações. Quando uma
//        opção for selecionada, o programa deve solicitar dois valores e mostrar o resultado da operação realizada.
//        Faça sub-rotinas para cada cálculo da calculadora.


import java.util.Scanner;

public class Questao03 {
    
    public static float somar (float num1, float num2){
        return num1 + num2;
    }

    public static float subtrair (float num1, float num2){
        return num1 - num2;
    }

    public static float multiplicar (float num1, float num2){
        return num1 * num2;
    }

    public static float dividir (float num1, float num2){
        return num1 / num2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float valor1, valor2, resultado = 0;
        
        System.out.println("""
        Digite a operação desejada de acordo com o menu abaixo:
        [1] Soma
        [2] Subtração
        [3] Multiplicação
        [4] Divisão""");
        int op = scan.nextInt();

        System.out.println("Digite o valor 1: ");
        valor1 = scan.nextFloat();

        System.out.println("Digite o valor 2: ");
        valor2 = scan.nextFloat();
        
        switch (op){
            case 1:
                resultado = somar(valor1, valor2);
                break;
            case 2:
                resultado = subtrair(valor1, valor2);
                break;
            case 3:
                resultado = multiplicar(valor1, valor2);
                break;
            case 4:
                resultado = dividir(valor1, valor2);
                break;
        }
        System.out.println("O resultado da operação escolhida é:" + resultado);
    }
}
