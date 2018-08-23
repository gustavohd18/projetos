/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepeticao001;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Exerciciorepeticao001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int maior = 0;
        for(int i = 0;i<=5;i++){
            
            System.out.println("digite o numero: ");
            int n1 = teclado.nextInt();
            int n2 = teclado.nextInt();
            int n3 = teclado.nextInt();
            System.out.println();
            if (n1 == n2 && n1 == n3){
                System.out.println("numero iguais");
            }
            else{
                  if(n1>n2 && n1>n3 ) {
                System.out.println(n1);
                if(n2>n3){
                    System.out.println(n2);
                    System.out.println(n3);
                }
                else{
                    System.out.println(n3);
                    System.out.println(n2);
                }
            }
            else if(n2>n1 && n2>n3){
                System.out.println(n2);
                if (n1>n3){
                    System.out.println(n1);
                    
                     System.out.println(n3);
                     
                }
                else{
                    System.out.println(n3);
                    System.out.println(n1);
            }
                
            }
            else if(n3 >n1&& n3>n2){
                        System.out.println(n3);
                        if(n1>n2){
                            System.out.println(n1);
                            System.out.println(n2);
                        }
                        else{
                            System.out.println(n2);
                            System.out.println(n1);
                        }
                        }
            }
            
            /*if(n1>n2 && n1>n3 && n2 > n3) {
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }
            if(n2>n1 && n2>n3 && n1 > n3) {
                System.out.println(n2);
                System.out.println(n1);
                System.out.println(n3);
            }
            //if(n3>n1 && n3>n2 && n2 > n1) {
              //  System.out.println(n3);
                //System.out.println(n2);
                //System.out.println(n1);
            //}*/
            
          

             
        }
    }
    
}
