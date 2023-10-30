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
public class CalculoPesoIdeal {
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       
       String gender;
       double altura, pesoIdeal = 0;
        
       System.out.println("Digite sua altura em metros: ");
        altura = scan.nextDouble();
        
       System.out.println("Digite seu sexo ('M' para masculino,'F' para feminino : ");
        gender = scan.next();
        
//        Uso da condicional switch para resolução.
       switch(gender.toUpperCase()){
           case "MASCULINO":
           case "M": {
               pesoIdeal = (float) ((72.7 * altura) - 58);
               break;
           }
           case "FEMININO":
           case "F":{
                pesoIdeal = (float) ((62.1 * altura) - 44.7);
                break;
                }
           default: 
                System.out.println("Entrada Inválida");
       } 
        
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
    
    
}
