//Questão 7: O código a seguir gera uma exceção proposital, o qual interrompe a execução do programa.
//        Corrija a classe, utilizando o tratamento de exceção, para que a execução não seja interrompida. Nota:
//        A exceçãoo lançada é a ArrayIndexOutOfBoundsException.

//QUESTÃO JÁ CORRIGIDA - TRATAMENTO DA EXCEÇÃO INSERIDO NO CÓDIGO.

public class Questao07 {
public static void PrimeiroMetodo () {
        System . out . println (" Inicio da execucao o primeiro metodo !");
        SegundoMetodo () ;
        System . out . println (" Fim da execucao do primeiro metodo !");
        }
public static void SegundoMetodo () {
    System . out . println (" Inicio da execucao o segundo metodo !") ;
        double v [] = new double [5];
        try {
            for (int i = 0; i <= 10; i ++) {
                v[i ] = i;
                System . out . println (i);
                }
            } catch ( ArrayIndexOutOfBoundsException e) {
            System . out . println (e. getMessage () );
            } finally {
            System . out . println (" Fim da execucao do segundo metodo !");
            }
        }
public static void main ( String [] args ) {
        System . out . println (" Inicio da main ");
        PrimeiroMetodo () ;
        System . out . println (" Fim da main ") ;
        }
}