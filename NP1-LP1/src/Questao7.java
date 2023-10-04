import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, quadradoDaSoma = 0, somadosQuadrados = 0;

        System.out.println("Digite um número inteiro: ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            quadradoDaSoma += i;
            somadosQuadrados += i * i;

        }
        quadradoDaSoma *= quadradoDaSoma;

        int resultado = quadradoDaSoma - somadosQuadrados;

        System.out.printf("A diferença entre o Quadrado da Soma e a Soma dos Quadrados dos %d primeiros números é: %d",num,resultado);
    }
}