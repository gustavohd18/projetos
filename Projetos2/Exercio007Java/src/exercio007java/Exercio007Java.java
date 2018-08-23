/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercio007java;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Exercio007Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite o numero: ");
        int n = teclado.nextInt();
        double dobro = Math.pow(n, 2);
        double triplo = Math.pow(n, 3);
        double raiz = Math.sqrt(n);
        System.out.println("o numero digitado foi :"+n);
        System.out.println("o dobro :"+dobro);
        System.out.println("o triplo: "+triplo);
        System.out.println("a raiz: "+raiz);
    }
    
}
