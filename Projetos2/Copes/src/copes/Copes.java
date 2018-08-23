/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copes;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Copes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double t = 0;
        System.out.println("Bem Vindo ao sistema de compras da PUCRS Varejo: ");
        Catalogo_Produto catalogo = new Catalogo_Produto();
        Caixa caixa = new Caixa();
       Scanner teclado = new Scanner(System.in);
       
       
       int continua = 1;
       while(continua == 1){
           System.out.println("Digite o codigo do produto: ");
           int cod = teclado.nextInt();
           if (catalogo.pesquisa(cod)==true){
              
               System.out.println(catalogo.descricao(cod));
               System.out.println("Digite a quantidade do produto: ");
               int quantidade = teclado.nextInt();
               System.out.println("o valor final do produto e "+catalogo.total3(cod,quantidade)+"Reais");
               caixa.relatorio(cod,quantidade);
                //t = caixa.total(cod,quantidade);
               
               System.out.println("Deseja continuar 1 para sim e 2 para nao");
               
                continua = teclado.nextInt();
           }else{
               System.out.println("nada encontrado");
           }
       }
        System.out.println("o total vendido do caixa e de "+t);
    }
    
}
