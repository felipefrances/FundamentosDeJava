/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals;

import java.util.Scanner;

/**
 *
 * @author lipef
 */
public class NumeroHarmonico {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num;
        
        float numHarmonico =0;
        
        System.out.println("Digite um numero inteiro: ");
        num = scan.nextInt();
        int i;
        
        for(i = 1; i <= num; i++){
            
           numHarmonico = 1 + (float)1/i;
            
        }
     
        System.out.println("O numero Harmonico é igual a: " + numHarmonico);
        
    }
}
