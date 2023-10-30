//Faça um programa, usando a linguagem de programaçao Java, que crie uma sub-rotina que
//        receba dois valores inteiros positivos relativos às dimensões de uma matriz. A sub-rotina deve preencher a
//        matriz com os dados fornecidos pelo usuário e, caso a matriz seja quadrada, deve-se realizar o somatório
//        dos elementos acima da diagonal principal.

import java.util.Scanner;

public class Questao05 {
public static void fillMatrix ( int lines , int columns ) {
            Scanner scan = new Scanner ( System . in );
            if ( lines == columns ) {
               int matrix [][] = new int [ lines ][ columns ];
               int summation = 0;
               for (int i = 0; i < lines ; i ++) {
                    for (int j = 0; j < columns ; j ++) {
                        System . out . printf (" Digite o indice m[%d, %d] = ", i , j );
                        matrix [ i ][ j] = scan . nextInt () ;
                        if(i < j ) {
                            summation = summation + matrix [i ][ j ];
                            }
                        }
                    }
                System . out . println (" Somatorio dos valores acima da diagonal principal : " + summation );
                } else {
                System . out . println ("A matriz nao eh uma matriz quadrada ") ;
                }
            scan . close () ;
            }

        public static void main ( String [] args ) {
            Scanner scan = new Scanner ( System . in );
            int indexCol , indexLine ;
            System . out . print (" Digite a quantidade de linhas : ");
            indexLine = scan . nextInt () ;
            System . out . print (" Digite a quantidade de colunas : ");
            indexCol = scan . nextInt () ;
            fillMatrix ( indexLine , indexCol );
            scan . close () ;
            }
}