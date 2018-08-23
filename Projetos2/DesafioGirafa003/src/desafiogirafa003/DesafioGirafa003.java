/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogirafa003;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class DesafioGirafa003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor para saque somente valores inteiros sem moeda: ");
        int dinheiro = teclado.nextInt();
        int cem = (int)(dinheiro/100);
        int resto_cem = dinheiro%100;
        int cinquenta = (int)(resto_cem/50);
        int resto_cinquenta = resto_cem%50;
        int vinte = (int)(resto_cinquenta/20);
        int resto_vinte = resto_cinquenta%20;
        int dez = (int)(resto_vinte/10);
        int resto_dez = resto_vinte%10;
        int cinco = (int)(resto_dez/5);
        int resto_cinco = dinheiro%5;
        int um = (int)(resto_cinco/1);
        System.out.println("notas de cem "+cem);
        System.out.println("notas de cinquenta "+cinquenta);
        System.out.println("notas de vinte "+vinte);
        System.out.println("notas de dez "+dez);
        System.out.println("notas de cinco "+cinco);
                System.out.println("notas de um "+um);

     

        
        
    }
    
}
