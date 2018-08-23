/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo_inverso;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Algoritmo_Inverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
                System.out.println("revisando exercicio de Algoritmo.");
                System.out.println("diga qual numero vc quer buscar: ");
                
                int v = teclado.nextInt();
                
                int verdadeiro = -1;
        
         int[] notas = new int[4];
         notas[0] = 5;
         notas[1] = 7;
         notas[2] = 15;
         notas[3] = 8;
         
         for(int j = 1; j<notas.length;j++){
             int chave = notas[j];
             int i = j - 1;
             while(i>=0 && notas[i]<chave){
                 notas[i+1]= notas[i];
                 i = i - 1;
                 notas[i+1] = chave;
             }
           
         }
           for (int j = 0; j < notas.length; j++) {

                System.out.println(notas[j]+"");
            }
           
           for(int j = 0;j< notas.length;j++){
               if(v == notas[j]){
                   verdadeiro = j;
               }
           }
           if(verdadeiro>0){
              System.out.println(verdadeiro); 
           }else{
               System.out.println("null");
           }
           
           
           
           
           
          
    }
    
}
