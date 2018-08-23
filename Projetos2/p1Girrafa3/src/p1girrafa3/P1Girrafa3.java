/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1girrafa3;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class P1Girrafa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o primeiro valor: ");
        int a = teclado.nextInt();
        System.out.println("informe o segundo numero: ");
        int b = teclado.nextInt();
        int antecessor = a;
        int atual  = b;
        int resto  = antecessor % atual;
        while (resto != 0){
         antecessor = atual;
         atual = resto;
        resto = antecessor % atual;
    
        }
         System.out.println(atual);

    }
    
}
