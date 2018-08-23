/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciovetorpucrs;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class ExercicioVetorpucrs {

   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int par = 0;
        int impar = 0;
        int primos = 0;
        int tot = 0;
        int soma = 0;
        int total = 0;
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("diga qual o tamanho do vetor:");
        int tamanho = teclado.nextInt();
        int [] vetor = new  int[tamanho];
        
        for(int i = 0;i< tamanho;i++){
            System.out.println("informe o numero: ");
            int valor = teclado.nextInt();
            vetor[i]= valor;
           
        }
        for (int i = 0;i<tamanho;i++){
            System.out.println("o valor:"+vetor[i]);
        }
        
        for(int i = 0;i<tamanho;i++){
            if (vetor[i]%2 == 0){
                par += 1;
            }else{
                impar +=1;
               
                
            }
            
            
            }
         for(int i = 0;i<tamanho;i++){
                //System.out.println(vetor[i]);
              for (int j = 0;j<vetor[i];j++ ){
                 System.out.println(vetor[i]);
            if(vetor[i]%j == 0){
                total += 1;
                
                
                
                
            }
            if(total == 2){
                
            }
           

            
            }
                       }
         
        
         
        
        
            
       
        
        System.out.println("impar "+impar);
        System.out.println("par "+par);
        System.out.println("soma"+soma);
       
       //tenos primos tenho que por primo(vetor[i]) onde o primo é o metodo acessando o conteudo armazenando na posicao i 
    }

    
}
