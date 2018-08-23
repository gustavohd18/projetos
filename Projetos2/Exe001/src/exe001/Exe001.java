/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe001;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Exe001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
        System.out.println("Diga seu telefone: ");
        int telefone = teclado.nextInt();
        while(telefone<11111111 || telefone>99999999){
            System.out.println("Diga seu telefone: ");
            telefone = teclado.nextInt();
        }
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(telefone);
    }
    
}
