/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("informe o carro que vc quer:popular ,classe a , superluxo");
        String modelodecarro = in.nextLine();
        double popular,classeA,superLuxo,custofinal;
        System.out.println("vc vai querer garantia estendida(sim) ou (nao)");
        String resposta = in.nextLine();
        popular = 30.000;
        custofinal = 0;
        if("sim".equals(resposta)){
            custofinal = popular +(10.000-(10.000*20/100));
            System.out.println("o custo final e "+custofinal);
        }else{
            custofinal = popular;
            System.out.println("o custo final e "+custofinal);
        }
        
    }
    
}
