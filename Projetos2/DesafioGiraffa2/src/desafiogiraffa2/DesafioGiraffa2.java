/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogiraffa2;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class DesafioGiraffa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner i = new Scanner(System.in);
        int maior = 0;
        int n = 0;
        while (n < 5){
        System.out.println("infome o digito:");
        int n1 = i.nextInt();
            while (maior<n1){
                maior = n1;
     
            }
          n = n+1;
        
    }
        System.out.println(maior);
}
}
