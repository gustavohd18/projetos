/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio002;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Desafio002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("diga se nome:");
        String nome = teclado.nextLine();
        System.out.println("bem vindo ao sistema "+nome);
        
    }
    
}
