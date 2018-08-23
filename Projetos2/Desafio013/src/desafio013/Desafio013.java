/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio013;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Desafio013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("diga o salario do funcionario: ");
        double sal = teclado.nextDouble();
        
        double sal_novo = sal+(sal * 15/100);
        System.out.println("o salario antigo do funcionario era "+sal+"e seu novo salario e de "+sal_novo);
    }
    
}
