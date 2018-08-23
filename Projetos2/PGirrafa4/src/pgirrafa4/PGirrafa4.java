/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgirrafa4;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class PGirrafa4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        float preco_c = 0;
        float preco_ca = 0;
        float preco_p = 0;
        float preco_final = 0;
        System.out.println("digitee o comprimento do cordar[1]50cm ou [2]70cm");
        int comprimento = teclado.nextInt();
        System.out.println("digite a categoria que deseja [1]prata simples [2]prata com pedras incrustadas");
        int categoria = teclado.nextInt();
        System.out.println("digite [1] para pendurado em gancho[2]caixa redonda");
        int ca = teclado.nextInt();
        if  (comprimento == 1){
            preco_c = 300;
        }else{
            preco_c = 400;
                    
        }
        if  (categoria == 1){
            preco_ca = 80;
        }else{
            preco_ca = 120;
                    
        }
        if  (ca == 1){
            preco_p = 200;
        }else{
            preco_p = 350;
                    
        }
        preco_final = preco_c+preco_ca+preco_p;
               
        System.out.println(preco_final);
    }
    
}
