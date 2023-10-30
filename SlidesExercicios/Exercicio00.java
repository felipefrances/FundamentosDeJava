/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals;

import java.util.Scanner;

/**
 *
 * @author felipefrances
 */
public class Exercicio00 {
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double grau, radiano;
        
        
        System.out.print("Digite o angulo em graus: \n");
        grau = scan.nextDouble();
                
        radiano = (grau * Math.PI/180);
        
        System.out.print ("O valor em radianos é: " +radiano);
    }

            
    
}
