import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float salario, parcelaEmprestimo;

        System.out.println("Digite o salário do funcionário: ");
        salario = scan.nextFloat();

        System.out.println("Digite o valor da prestação do empréstimo requerido: ");
        parcelaEmprestimo = scan.nextFloat();

        if(parcelaEmprestimo > salario * 0.2){
            System.out.println("Empréstimo não concedido.");
        }
        else {
            System.out.println("Empréstimo concedido");
        }
    }

}
