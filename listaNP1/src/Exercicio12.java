//Faça um programa que calcule a diferença entre a soma dos quadrados dos primeiros 10
//números naturais e o quadrado da soma.
//Exemplo: a soma dos quadrados dos dez primeiros números naturais é: 12 + 22 + ... + 102 = 385
//O quadrado da soma dos dez primeiros números naturais é: (1 + 2 +...+10)2 = 3025
//A diferença entre a soma dos quadrados dos dez primeiros números naturais e o quadrado
//da soma é: 3025 - 385 = 2640

import static java.lang.System.*;

public class Exercicio12 {

    public static void main(String[] args) {

        int quadradoDaSoma =0, somaDosQuadrados = 0;

        for(int i = 1; i <= 10; i++){

            quadradoDaSoma += i;
            somaDosQuadrados += (i*i);
        }

        quadradoDaSoma *= quadradoDaSoma;

        int diferenca = quadradoDaSoma - somaDosQuadrados;

        out.println(quadradoDaSoma);
        out.println(somaDosQuadrados);
        System.out.println("A diferença entre o quadrado da soma e a soma do quadrado dos 10 primeiros números naturais é:" + diferenca);
    }



}
