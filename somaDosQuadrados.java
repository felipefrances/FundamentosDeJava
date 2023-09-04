/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafundamentals;

/**
 *
 * @author felipefrances
 */
public class somaDosQuadrados {

    public static void main(String[] args) {
        
        int numero = 0, somaDosQuadrados = 0, quadradoDaSoma = 0; 
        int total;
        
        while (numero <=10){
            
            somaDosQuadrados = somaDosQuadrados + (numero*numero);
                   
            quadradoDaSoma = quadradoDaSoma + numero;
            
            numero++;
        }
        quadradoDaSoma = quadradoDaSoma * quadradoDaSoma;
        total = quadradoDaSoma - somaDosQuadrados;
        
        System.out.println("O resultado da soma dos quadrados e do quadrado da soma dos 10 primeiros números naturais é: " +total);
    }
        
}

