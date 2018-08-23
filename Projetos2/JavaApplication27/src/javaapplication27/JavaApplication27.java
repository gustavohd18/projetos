/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author maivo
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca n = new Biblioteca();
        int [][] matriz = new int [4][4];
        matriz[0][0] = 1;
        matriz[0][1] = 4;
        matriz[0][2] = 7;
        matriz[0][3] = 2;
        matriz[1][0] = 7;
        matriz[1][1] = 8;
        matriz[1][2] = 9;
        matriz[1][3] = 13;
        matriz[2][0] = 17;
        matriz[2][1] = 47;
        matriz[2][2] = 77;
        matriz[2][3] = 27;
        int quantidadep = 0;
        int quantidadei = 0;
        for (int i = 0;i< matriz.length;i++){
            for (int j = 0;j<matriz[0].length;j++){
                if (n.par(matriz[i][j])==true){
                    quantidadep+=1;
                    System.out.println(matriz[i][j]);
                }else{
                    quantidadei+=1;
                }
            }
        }
        n.imprimeMatriz(matriz);
        System.out.println("o maior da matriz e "+n.retornaMaior(matriz));
        System.out.println(" ");
        System.out.println("a quantidade de  pares de "+quantidadep);
        System.out.println("a quantidade de impares e "+quantidadei);
        
    }
    
}
