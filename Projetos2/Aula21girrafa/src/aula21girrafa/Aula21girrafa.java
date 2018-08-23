/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula21girrafa;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Aula21girrafa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // posso atribuir os valores de um vetor a uma variavel e poder fazer varias coisas nele.
// como é um tipo de dado posso por minhas classes ali dentro.[] indica o conteudo é o endereco de um objeo de classe array.guarda o endereco de objeto do tipo array 
        Scanner teclado = new Scanner(System.in);
        System.out.println("diga qual o tamanho do vetor:");
        int tamanho = teclado.nextInt();
        int[] vetor = new int[tamanho];
        //ou double [] valores = {1,5,6.8,3,4.5}
        String[] vetor2 = new String[10];
        for (int i = 0 ;i <tamanho;i ++){
            System.out.println("digite o valor para guardar:");
            int valor = teclado.nextInt();
            vetor[i] = valor;
        }
        for (int i = 0 ;i <tamanho;i ++){
            System.out.println("o valor do vetor e "+ vetor[i]);
            
        }
        
        
     
    }
    
}
