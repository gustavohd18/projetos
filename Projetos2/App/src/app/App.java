/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             CatalogoProdutos catProd = new CatalogoProdutos();
        Registradora registradora = new Registradora(catProd);
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Entre o codigo do produto");
            System.out.println("Codigo -1, encerra dia");
            System.out.print("-->");
            int codigo = input.nextInt();
            if (codigo == -1){
                break;
            }else{
              System.out.println("Digite a quantidade");
              int qtdade = input.nextInt();
              double custoItem = registradora.registraVenda(codigo,qtdade);
              if (custoItem == -1.0){
                System.out.println("Produto inexistente!!");
              }else{
                System.out.println("Total a pagar:"+custoItem);
                registradora.adicionar(qtdade, codigo, custoItem);
              }
            }
        }
        System.out.println("Encerrando o caixa !!");
        System.out.println("Total vendido no dia:"+registradora.getTotalVendido());
        registradora.rela();
        input.close();
    }
    }
    

