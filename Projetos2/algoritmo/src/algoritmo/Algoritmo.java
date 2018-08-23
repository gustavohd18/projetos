/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

/**
 *
 * @author maivo
 */
public class Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("revisando exercicio de Algoritmo.");
        
         int[] notas = new int[4];
         notas[0] = 10;
         notas[1] = 7;
         notas[2] = 5;
         notas[3] = 2;
         
         for(int j = 1; j<notas.length;j++){
             int chave = notas[j];
             int i = j - 1;
             while(i>=0 && notas[i]>chave){
                 notas[i+1]= notas[i];
                 i = i - 1;
                 notas[i+1] = chave;
             }
         }
           for (int j = 0; j < notas.length; j++) {

                System.out.print(notas[j]+"");

            }
    }
    
}
