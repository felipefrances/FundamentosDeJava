//Questão 4 Faça um programa usando a linguagem Java que crie uma interface gráfica que o usuário
//possa passar dois valores numáricos. O programa deve possuir os botões de somar, subtrair, multiplicar e dividir.
// Ao acionar um dos botões, deve aparecer o resultado da operação.

    import java . awt . Container ;
    import javax . swing . JButton ;
    import javax . swing . JFrame ;
    import javax . swing . JLabel ;
    import javax . swing . JTextField ;
    import java . awt . event .*;
    import javax . swing . JDialog ;

    public class Exercicio04 extends JFrame {
        JTextField ENTER1 ;
        JTextField ENTER2 ;
        JButton SUMBUTTON ;
        JButton MINUSBUTTON ;
        JButton MULTBUTTON ;
        JButton DIVBUTTON ;
        JLabel ROTULO1 ;
        JLabel ROTULO2 ;
        JLabel RESULT ;
        public Exercicio04() {
           super (" Calculadora Simples ") ;
           Container container = getContentPane () ;
           SUMBUTTON = new JButton ("+");
           MINUSBUTTON = new JButton ("-");
           MULTBUTTON = new JButton ("*");
           DIVBUTTON = new JButton ("/");

           ENTER1 = new JTextField () ;
           ENTER2 = new JTextField () ;

           ROTULO1 = new JLabel (" Valor 1: ") ;
           ROTULO2 = new JLabel (" Valor 2: ") ;

           RESULT = new JLabel ("O resultado eh: ");

           setLayout ( null ) ;

           container . add ( ROTULO1 );
           container . add ( ENTER1 );
           container . add ( ROTULO2 );
           container . add ( ENTER2 );
           container . add ( SUMBUTTON );
           container . add ( MINUSBUTTON );
           container . add ( MULTBUTTON ) ;
           container . add ( DIVBUTTON );

           container . add ( RESULT );

           ROTULO1 . setBounds (30 , 30 , 110 , 20) ;
           ENTER1 . setBounds (80 , 30 , 110 , 20) ;
           ROTULO2 . setBounds (30 , 60 , 110 , 20) ;
           ENTER2 . setBounds (80 , 60 , 110 , 20) ;

           SUMBUTTON . setBounds (30 , 90 , 50 , 30) ;
           MINUSBUTTON . setBounds (80 , 90 , 50 , 30) ;
           MULTBUTTON . setBounds (130 , 90 , 50 , 30) ;
           DIVBUTTON . setBounds (180 , 90 , 50 , 30) ;

           RESULT . setBounds (30 , 130 , 150 , 30) ;

           SumOption sum = new SumOption () ;
           MinusOption minus = new MinusOption () ;
           MultOption multi = new MultOption () ;
           DivOption div = new DivOption () ;

           SUMBUTTON . addActionListener ( sum );
           MINUSBUTTON . addActionListener ( minus );
           MULTBUTTON . addActionListener ( multi );
           DIVBUTTON . addActionListener ( div );

           setSize (300 , 250) ;
           setVisible ( true );
           }
        private class SumOption implements ActionListener {
            @Override
            public void actionPerformed ( ActionEvent e) {
                double value1 = Double . parseDouble ( ENTER1 . getText () );
                double value2 = Double . parseDouble ( ENTER2 . getText () );
                double res = value1 + value2 ;
                RESULT . setText (" Resultado : " + res );
            }
        }

        private class MinusOption implements ActionListener {
            @Override
            public void actionPerformed ( ActionEvent e) {
                double value1 = Double . parseDouble ( ENTER1 . getText () );
                double value2 = Double . parseDouble ( ENTER2 . getText () );
                double res = value1 - value2 ;
                RESULT . setText (" Resultado : " + res );
            }
        }

        private class MultOption implements ActionListener {
            @Override
            public void actionPerformed ( ActionEvent e) {
                double value1 = Double . parseDouble ( ENTER1 . getText () );
                double value2 = Double . parseDouble ( ENTER2 . getText () );
                double res = value1 * value2 ;
                RESULT . setText (" Resultado : " + res );
            }
        }

        private class DivOption implements ActionListener {
            @Override
            public void actionPerformed ( ActionEvent e) {
                double value1 = Double . parseDouble ( ENTER1 . getText () );
                double value2 = Double . parseDouble ( ENTER2 . getText () );
                if ( value2 == 0) {
                    RESULT . setText (" Resultado : -inf ");
                    } else {
                    double res = value1 / value2 ;
                    RESULT . setText (" Resultado : " + res );
                    }
            }
        }

    public static void main ( String [] args ) {
        javax . swing . SwingUtilities . invokeLater (
                new Runnable () {
        public void run () {
            JFrame . setDefaultLookAndFeelDecorated ( true );
            JDialog . setDefaultLookAndFeelDecorated ( true );
            Exercicio04 calc = new Exercicio04() ;
            calc . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE ) ;
        }
                }
                );
    }
}

