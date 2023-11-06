//Questão 1 Faça um programa usando a linguagem Java que crie uma interface gráfica que imprima
//        uma mensagem de “Bem vindo a primeira GUI” por meio de um componente JLabel e que o título do Frame
//        seja “Olá Mundo”.

import javax . swing .*;
public class Exercicio01 {
    public static void main ( String [] args ) {

        JFrame frame = new JFrame ("Ola Mundo ");
        JLabel label = new JLabel ("Bem vindo a primeira GUI ");

        frame . setLayout ( null );
        frame . getContentPane () . add ( label );
        label . setBounds (30 , 30 , 200 , 50) ;
        frame . setSize (300 , 200) ;
        frame . setVisible ( true );
        frame . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
        }
}

