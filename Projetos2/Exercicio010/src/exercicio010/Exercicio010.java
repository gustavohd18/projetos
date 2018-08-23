/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio010;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Exercicio010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
       Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor em real: ");
        float real = teclado.nextFloat();
        double conversor = (real/ 3.19);
        System.out.println("o valor em dolar e de "+conversor);
    }
    
}
