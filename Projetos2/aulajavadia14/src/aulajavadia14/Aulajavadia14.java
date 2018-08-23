/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajavadia14;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Aulajavadia14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o nome: ");
        String n1 = teclado.nextLine();
        System.out.println("digite o nome:");
        String n2 = teclado.nextLine();
        System.out.println("digite o nome: ");
        String n3 = teclado.nextLine();
                
       for (int i = 0; i < n1.length()-1; i++){
           System.out.print(n1.charAt(i));
       }
       System.out.print("o\n");
       for (int i = 0; i < n2.length()-1; i++){
           System.out.print(n2.charAt(i));
       }
       System.out.print("o\n");
        for (int i = 0; i < n3.length()-1; i++){
           System.out.print(n3.charAt(i));
       }

    System.out.print("o\n");

    }
    
}
