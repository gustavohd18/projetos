/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio009;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Desafio009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int aux= 1;
        System.out.println("digite o numero que quer saber a tabuada");
        int n = teclado.nextInt();
        while (aux<11){
            int tabuada = n * aux;
            System.out.println(n+" x "+aux+ " = "+tabuada);
            
            aux = aux + 1;
                    
                   
        }
        
    }
    
}
