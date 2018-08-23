/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercio008;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Exercio008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor em metros: ");
        float metros = teclado.nextFloat();
        float centimetros = metros*100;
        float milimetro = metros*1000;
        System.out.println("em metros e "+metros+" em centimetros e "+centimetros+" e em milimetros e "+milimetro);
        
               
    }
    
}
