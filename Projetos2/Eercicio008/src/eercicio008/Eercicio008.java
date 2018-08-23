/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eercicio008;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Eercicio008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("digite sua primeira nota: ");
        int n1 = in.nextInt();
        System.out.println("digite o segundo numero: ");
        int n2 = in.nextInt();
        double media = (n1 + n2) / 2;
        System.out.println("a media e : "+media);
                
        
    }
    
}
