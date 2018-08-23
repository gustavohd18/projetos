/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepeticaogirrafa1;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Exerciciorepeticaogirrafa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
         int maior = 0;
        for(int i = 0;i<=4;i++){
            
            System.out.println("diga a data de nascimento:");
            
            int Dia = teclado.nextInt();
            System.out.println("diga o mes:");
            int Mes = teclado.nextInt();
            if (Mes==1 &&  Dia>20 && Mes==2 && Dia<19){
                 System.out.println("aquario"); 
             }
  
      else  if (Mes==2 && Dia>18 || Mes==3 && Dia<20){
                System.out.println("peixes");
        }
    
    else if (Mes==3 && Dia>19 || Mes==4 && Dia<21){
         System.out.println("aries");
     }
     
     else if (Mes==4 && Dia>20 || Mes==5 && Dia<21){
         System.out.println("touro");
     }
        
     
     if (Mes==5 && Dia>20 || Mes==6 && Dia<21){
         System.out.println("gemios");
     }
        
     
     else if (Mes==6 && Dia>20 || Mes==7 && Dia<22){
         System.out.println("cancer");
     }
      
     
     else if (Mes==7 && Dia>21 || Mes==8 && Dia<23){
         System.out.println("leao");
     }
         
    
     else if (Mes==8 && Dia>22 || Mes==9 && Dia<23){
         System.out.println("virgem");
     }
     
     else if  (Mes==9 && Dia>22 || Mes==10 && Dia<23){
         
          System.out.println("libra");
                
            }
        }
      
       
    }
    
}
