/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio003;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Exercicio003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite o primeiro numero: ");
        int n1 = teclado.nextInt();
        System.out.print("digite o segundo numero: ");
        int n2 = teclado.nextInt();
        int soma = n1 + n2;
        System.out.print("a soma entre "+n1+" e "+n2+" e "+soma);
    }
    
}
