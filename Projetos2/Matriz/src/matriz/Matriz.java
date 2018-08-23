
package matriz;

import java.util.Scanner;

public class Matriz 

{

    public static void main(String[] args)
    {
       Scanner teclado =new  Scanner(System.in);
        int [][] matriz = new int[3][4];
        int [][] matriz2 = new int[3][3];
        int [][] matriz3 = new int [4] [4];
         for(int i = 0;i< matriz.length;i++){
             for(int j = 0;j<matriz[0].length;j++){
                 
                 System.out.println("digite o valor da matriz na posicacao "+"["+(i+ 1)+"]["+(j+ 1)+"]");
                 matriz[i][j] = teclado.nextInt();
            }
             }
         System.out.println("obrigado vamos para proxima matriz");
         for(int i = 0;i< matriz2.length;i++){
             for(int j = 0;j<matriz2.length;j++){
                 
                 System.out.println("digite o valor da matriz na posicacao "+"["+(i+ 1)+"]["+(j+ 1)+"]");
                 matriz2[i][j] = teclado.nextInt();
            }
             }
         System.out.println("obrigado vamos para a ultima matriz");
         for(int i = 0;i< matriz3.length;i++){
             for(int j = 0;j<matriz3.length;j++){
                 
                 System.out.println("digite o valor da matriz na posicacao "+"["+(i+ 1)+"]["+(j+ 1)+"]");
                 matriz3[i][j] = teclado.nextInt();
            }
             }
         for(int i = 0;i< matriz.length;i++){
             for(int j = 0;j<matriz.length;j++){
                 
                 System.out.print(matriz[i][j]+" ");
                
            }
             System.out.println();
             }
         for(int i = 0;i< matriz2.length;i++){
             for(int j = 0;j<matriz2.length;j++){
                 
                 System.out.print(matriz2[i][j]+" ");
                
            }
             System.out.println();
             }
         for(int i = 0;i< matriz3.length;i++){
             for(int j = 0;j<matriz3.length;j++){
                 
                 System.out.print(matriz3[i][j]+" ");
                
            }
             System.out.println();
             }
       
    }
    
}
