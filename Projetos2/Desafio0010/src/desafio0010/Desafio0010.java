/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio0010;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Desafio0010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor e real: ");
        double real = teclado.nextDouble();
        double conversor = real / 3.50;
        System.out.println("o valor informado em real foi de "+real+"e o valor em dolar e de "+conversor);
    }
    
}
