/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogirrafa;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class DesafioGirrafa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite o numero que vc quer ao oposto: ");
        String n = teclado.nextLine();
        String s = new StringBuilder(n).reverse().toString();
        System.out.print(s);

        
        
        
    }
    
}
