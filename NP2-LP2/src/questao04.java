import java.util.Scanner;

public class questao04 {

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
