//Faca um programa que pergunte quanto você ganha por hora e o numero de horas trabalhadas
//por mês. Calcule e mostre o total do seu salario no referido mês, sabendo-se que são descontados
//11% para o Imposto de Renda (IR), 8% para o INSS e 5% para o maldito sindicato.
//Seu programa deve seguir o modelo de saída abaixo:
//        + Salário Bruto: R$
//        - IR (11%): R$
//        - INSS (8%): R$
//        - Sindicato (5%): R$
//        = Salário Líquido: R$
//        Obs.: Salário Bruto - Descontos = Salário Líquido

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        float salarioHora, salarioBruto;
        int horas;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu ganho por hora:");
        salarioHora = scan.nextFloat();

        System.out.println("Digite o número de horas trabalhadas no mês:");
        horas = scan.nextInt();

        salarioBruto = salarioHora * horas;
        float impostoRenda = (float) (salarioBruto * 0.11);
        float inss = (float) (salarioBruto * 0.08);
        float sindicato = (float) (salarioBruto * 0.05);

        float salarioLiquido =  salarioBruto - impostoRenda - inss - sindicato;

        System.out.println("+ Salário Bruto =" +salarioBruto);
        System.out.println(" - Imposto de Renda (11%): " +impostoRenda);
        System.out.println(" - INSS (8%): " +inss);
        System.out.println(" - Sindicato (5%): " +sindicato);
        System.out.println(" = Salário Líquido: " +salarioLiquido);
    }
}
