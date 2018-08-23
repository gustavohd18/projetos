/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio008;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Desafio008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a medidas em metros");
        float n = teclado.nextFloat();
        double cm = n *100;
        double m = n * 1000;
        System.out.println("a media em cm e "+cm);
        System.out.println("a medida e mm e "+m);
        
    }
    
}
