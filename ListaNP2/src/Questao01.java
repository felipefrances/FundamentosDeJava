//Questão 1 Faça um programa usando a linguagem de programção Java que calcule o IMC e o peso ideal
//        de uma pessoa com base em seu gênero. Para isso, o usuário deve passar o seu peso (kg), altura (m) e seu
//        gênero (homem/mulher - h/m). Devem ser criadas sub-rotinas tanto o cálculo do IMC quanto o cálculo
//        do peso ideal.
//        Nota:
//        - IMC = Peso/altura2
//        - Peso Ideal:
//        - Homens: (72.7*altura) - 58
//        - Mulheres: (62.1*altura) - 44.7

import java.util.Scanner;

public class Questao01 {

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);

    }

    public static double calcularPesoIdeal(double altura, String gender) {
       double pesoIdeal = 0;
        switch (gender.toUpperCase()) {
            case "MASCULINO":
            case "M": {
                pesoIdeal = ((72.7 * altura) - 58);
                break;
            }
            case "FEMININO":
            case "F": {
                pesoIdeal = ((62.1 * altura) - 44.7);
                break;
            }
        }
        return pesoIdeal;
    }


        public static void main( String[] args) {
        Scanner scan = new Scanner(System.in);

        String genero;
        double alt, peso, pesoIdeal, imc;

        System.out.println("Digite sua altura em metros: ");
        alt = scan.nextDouble();

        System.out.println("Digite seu peso em quilos: ");
        peso = scan.nextDouble();

        System.out.println("Digite seu sexo ('M' para masculino,'F' para feminino : ");
        genero = scan.next();

        imc = calcularIMC(peso, alt);
        pesoIdeal = calcularPesoIdeal(alt, genero);

        System.out.println("Seu IMC é " +imc);
        System.out.println("Seu peso ideal é " +pesoIdeal);

    }
}