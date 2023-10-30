//Questão 4: Ampliando a questão anterior, crie um “help” para que os usuários do seu programa possam
//        ler as dicas de como utilizar o sistema. Este help deve ser uma sub-rotina e o usuário deve passar o
//        comando -h ou help para poder acessá-lo via linha de comando.

import java . util . Scanner ;
public class Questao04 {
 public static double soma ( double a , double b) {
        return a + b;
         }
public static double subtracao ( double a , double b) {
        return a - b;
         }
 public static double multiplicacao ( double a , double b) {
         return a * b;
         }
 public static double divisao ( double a , double b) throws ArithmeticException {
         return a / b;
         }

         public static int optionsMenu () {
         Scanner in = new Scanner ( System . in ) ;
         System . out . println ("1 - Soma ") ;
         System . out . println ("2 - Subtracao ");
         System . out . println ("3 - Multiplicacao ");
         System . out . println ("4 - Divisao ");
         System . out . println ("5 - Sair ");
         return Integer . parseInt ( in . nextLine () );
         }

         public static void ajuda () {
         System . out . println (" Bem vindo à Calculadora Básica:");
         System . out . println (" autor : Felipe Frances");
         System . out . println (" As opções disponíveis são:") ;
         System . out . println ("1 - Soma ") ;
         System . out . println ("2 - Subtracao ");
         System . out . println ("3 - Multiplicacao ");
         System . out . println ("4 - Divisao ");
         System . out . println ("5 - Sair ");
        }

    public static void main(String[] args) {
             int option;
         double firstInput , secondInput , result = 0;
         Scanner in = new Scanner ( System . in ) ;

         if ( args [0]. equals ("-h") || args [0]. equals (" help ") ) {
             ajuda() ;
             System . exit (0) ;
             } else {
             do {
                 option = optionsMenu () ;
                 if ( option == 5) {
                     System . exit (0) ;
                     }
                 System . out . print ("a: ");
                 firstInput = in . nextDouble () ;
                 System . out . print ("b: ");
                 secondInput = in . nextDouble () ;
                 switch ( option ) {
                     case 1:
                         result = soma ( firstInput , secondInput ) ;
                         break ;
                     case 2:
                         result = subtracao ( firstInput , secondInput );
                         break ;
                    case 3:
                        result = multiplicacao ( firstInput , secondInput );
                        break ;
                    case 4:
                        try {
                            result = divisao ( firstInput , secondInput ) ;
                            } catch ( ArithmeticException e) {
                            System . err . println (e. getMessage () );
                            }
                        break ;
                    default :
                         System . out . println ("No one option choose .");
                         break ;
                     }
                 System . out . println (" Result = " + result ) ;
                } while ( true );
         }
         }
 }