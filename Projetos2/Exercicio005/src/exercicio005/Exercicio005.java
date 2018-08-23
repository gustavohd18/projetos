/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio005;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Exercicio005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int n = teclado.nextInt();
        int maior = n + 1;
        int menor = n -1;
        System.out.print("o numero digitado foi "+n+" e o antecessor e "+menor+" e o sucessor e "+maior);
    }
    
}
