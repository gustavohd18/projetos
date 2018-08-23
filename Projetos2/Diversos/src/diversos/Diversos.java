/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversos;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Diversos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.print("diga o tipo [1] carro popular [2]classe a [3]superluxo");
        int escolha = teclado.nextInt();
        double preco_popular = 30.000;
        if (escolha == 1){
            System.out.print("deseja garantia estendida [1]sim e [2]nao");
            int garantia = teclado.nextInt();
            if(garantia == 1){
            preco_popular = 30.000 + (10.000-(10.000*20/100));    
                System.out.println("o preco final e "+preco_popular);
                
            }else{
                preco_popular = 30.000;
                System.out.println(preco_popular);
            }
            System.out.println("vc quer o opcional de seguranca[1]sim [2]nao");
            int escolha1 = teclado.nextInt();
            if(escolha1 == 1){
                 preco_popular = preco_popular + (10.000-10.000*20/100);
                 System.out.print(preco_popular);
            }else{
                System.out.print(preco_popular);
            }
            System.out.print("vc quer a opcao esportividade [1]sim [2]nao ");
            int escolha2 = teclado.nextInt();
            if (escolha2 == 1){
                preco_popular = preco_popular+(12.000-(12.000*20/100));
                System.out.println(preco_popular);
            }else{
                System.out.println(preco_popular);
            }
            System.out.println("vc quer estetica [1]sim [2]nao");
            int escolha3 = teclado.nextInt();
            if(escolha3 == 1){
                preco_popular = preco_popular + (15.000-(15.000*20/100));
                System.out.print(preco_popular);
            }else{
                System.out.println(preco_popular);
            }
            System.out.println();
        }
       
    }
    
}
