import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, fatorial = 1;

        System.out.println("Digite um valor inteiro positivo:");
        num = scan.nextInt();

        for(int i = 1; i <=num; i++){
            fatorial *= i;
        }

        if(num < 0) {
            System.out.println("O número digitado não é positivo.");
        }
        else if(num == 0){
            System.out.println("O fatorial do número digitado é 1.");

        }
        else {
            System.out.printf("O fatorial de %d é: %d.", num, fatorial);
        }
    }
}
