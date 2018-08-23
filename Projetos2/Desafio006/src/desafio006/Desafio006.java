/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio006;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Desafio006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        System.out.println("digite um numero");
        int n1 = n.nextInt();
        int dobro = n1*2;
        int triplo = n1 *3;
        double raiz = Math.round(Math.sqrt(n1));
        System.out.println("a raiz quadrada e "+raiz);
        System.out.println("o triplo e  "+triplo);
        System.out.println("o dobro e "+dobro);
                
        
    }
    
}
