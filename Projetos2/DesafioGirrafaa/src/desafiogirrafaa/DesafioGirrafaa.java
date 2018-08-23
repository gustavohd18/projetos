/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogirrafaa;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class DesafioGirrafaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner teclado = new Scanner(System.in);
         float n = teclado.nextFloat();
         int m = (int)n;
         while (n != m){
           System.out.println("digite o numero que seja inteiro");
            float n1 = teclado.nextFloat();
            n = n1;
            }
         System.out.println(n);
        }  
}
