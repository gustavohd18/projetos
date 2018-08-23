/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a temperatura em graus: ");
        double c = teclado.nextDouble();
        double f = (9*c/5)+32;
        System.out.println(f);
    }
    
}
