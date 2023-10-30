//Questão 6 Faça um programa, usando a linguagem de programação Java, que crie uma sub-rotina que
//        calcule o fatorial de um número. A sub-rotina deve ser implementada de forma recursiva.

import java . util . Scanner ;
public class Questao06 {
public static int subrotineFatorialRecursive ( int value ) {
    if (value == 0) {
        return 1;
    }
    else {
        return value * subrotineFatorialRecursive ( value - 1) ;
    }
    }

        public static int subrotineFatorialBasic ( int value ) {
        int fat = 1;
        for ( int i = 1; i <= value ; i ++) {
        fat *= i ;
        }
        return fat ;
        }

        public static void main ( String [] args ) {
        Scanner scan = new Scanner ( System . in );
        int value , resultBasic , resultRecursive ;
        System . out . print (" Valor : ");
        value = scan . nextInt () ;
        if ( value < 0) {
        System . out . println (" Nao ha fatorial negativo ");
        } else {
        resultBasic = subrotineFatorialBasic ( value );
        System . out . println (" Fatorial Basico = " + resultBasic );
        resultRecursive = subrotineFatorialRecursive ( value );
        System . out . println (" Fatorial Recursivo = " + resultRecursive );
        }
        scan . close () ;
        }
        }