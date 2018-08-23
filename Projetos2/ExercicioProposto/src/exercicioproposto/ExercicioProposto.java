    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioproposto;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class ExercicioProposto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o numero: ");
        int a = teclado.nextInt();
        System.out.println("digite o numero:");
        int b = teclado.nextInt();
        System.out.println("digite o numero: ");
        int c = teclado.nextInt();
        if (a == b && b==c){
            System.out.println("os seguintes numero digitados "+a+" e "+b+" e "+c);
        }else if(a > b && b>c){
            System.out.println("o menor numero digitado e "+c);
        }else if(b>a && c>a){
            System.out.println("o menor numero digitado e "+a);
        }else if (c>a && a>b){
            System.out.println("o menor numero digitado e "+b);
        }else if(a<b && b>c){
        System.out.println("o menor numero digitado e "+c);
        }else if (a>b && c>b){
            System.out.println("o menor numero digita e "+b);
        }else if (a==b && a>c){
            System.out.println("o menor valor digitado e "+c);
        }else if (b==c && b>a){
            System.out.println("o menor valor digitado e "+a);
        }else if (a==b && c>b){
            System.out.println("o menor valor digitado sao 2 que sao"+a+" e "+b);
        }else if(b==c && b>a){
            System.out.println("tem 2 menores numeros q sao "+b+" e "+c);
        }
    }
    
}
