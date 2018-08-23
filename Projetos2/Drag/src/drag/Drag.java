/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drag;

import java.util.Scanner;

/**
 *
 * @author maivo
 * os dragoes comem 0.5% de seu peso e vai aumentando o peso e quantidade de comida tambem.
 */
public class Drag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o nome do dragao");
        String nome = teclado.nextLine();
        System.out.println("dgite o peso do dragao");
        double peso = teclado.nextDouble();
        System.out.println("diga quanto vem em cada saco de ração");
        int racao = teclado.nextInt();
        System.out.println("diga qual o valor do saco de racao");
        double valorSaco = teclado.nextDouble();
        double aux = 0;
        int dias = 0;
        double aux2 = 0;
        double aux3 = 0;
        double comer = 0;
        while (dias != 3)
        {
           comer = 0.5*(peso/100);
           aux2 = peso + comer;
           aux = comer+0.5*(aux2/100);
          
          dias = dias +1;  
        }
        System.out.println(aux);
    }
    
}
