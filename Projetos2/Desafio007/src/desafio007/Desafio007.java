/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio007;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Desafio007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite sua primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.println("digite sua segunda nota: ");
        float n2 = teclado.nextFloat();
        double media = (n1+n2)/2;
        System.out.println("a media dos alunos é de "+media);
        
    }
    
}
