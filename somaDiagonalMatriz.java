package javafundamentals;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class somaDiagonalMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite a posição [%d][%d] da matriz: ",i+1, j+1);
                matriz[i][j] = scan.nextInt();
                if (i == j) {
                    somaDiagonal = somaDiagonal + matriz[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal principal da matriz é " + somaDiagonal);
        scan.close();
    }

}
