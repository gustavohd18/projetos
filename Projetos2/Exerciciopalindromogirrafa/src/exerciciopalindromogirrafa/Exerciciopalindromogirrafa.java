/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopalindromogirrafa;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Exerciciopalindromogirrafa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String palavra, palavraInvertida="";
       int tamanho,i;
        System.out.println("digite a palavra");
       // pego  a palavra e boto  numa String
       palavra = teclado.nextLine(); 
       //pega quanto letras a palavra tem
       tamanho=palavra.length(); 
       //pega a ultima letra da variavel palavra, e inseri na primeira de palavraInvertida, depois pega penultima e inseri na 2ª,e assim em diante, até pegar a primeira, e colocar na ultima.
       for(i=tamanho-1;i>=0;i--){  
           palavraInvertida = palavraInvertida + palavra.charAt(i);
        }
       //ve se elas sao igguais e diz se sao ou nao String
       if(palavra.equals(palavraInvertida)) {
            System.out.println(" É uma palavra palindroma"); 
       }else {
            System.out.println(" Não é uma palavra palindroma"); 
}
}
}
    
