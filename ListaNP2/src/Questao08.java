//Questão 8: O código a seguir possui partes problemáticas, o qual podem gerar exceções. Identifique as
//        exceções que podem acontecer e, para cada uma delas, deve ser feito um tratamento adequado (alertar o
//        usuário sobre o problema).

public class Questao08 {
public static int iterativeDivide ( int ... args ) {
        int total = 1;
        for ( int i : args ) {
            total /= i;
            }
        return total ;
        }
public static String toLowerCase ( String phrase ) {
        String newPhrase = null ;
        newPhrase = phrase . toLowerCase () ;
        return newPhrase ;
        }
public static void main ( String [] args ) {
        System . out . println ( iterativeDivide (1 , 2 , 3 , 4 , 0) );
        System . out . println ( toLowerCase (" OLA A TODOS "));
        }
}
