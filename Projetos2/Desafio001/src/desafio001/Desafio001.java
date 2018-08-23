/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio001;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Desafio001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o numero:");
        int n1 = teclado.nextInt();
        System.out.println("digite outro numero");
        int n2 = teclado.nextInt();
        float media = n1 + n2;
        System.out.println("a media e "+media);
        
    }
    
}
