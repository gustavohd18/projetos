/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio26;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Exercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a frase: ");
        String frase = teclado.nextLine();
        int cont = 0;
        char b = 'a';
        int posi = 0;
        char[] frase1 = frase.toCharArray();
       for (int i = 0; i < frase1.length; i++) {
             if (frase1[i] == b) {
                 cont +=1;
                 
             } 
    }
       int posicao = frase.indexOf("a");
        System.out.println(cont);
        System.out.println(posicao);
        
        posi = frase.lastIndexOf("a");
    
        System.out.println(posi);
    }
}
    

