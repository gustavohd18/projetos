package exerciciomatriz;

/**
 *
 * @author Gustavo Duarte , João Vitor , Gustavo Santos, Caio Bernades.
 */
public class Exerciciomatriz {
    //Metodo para calcular a soma da 6 matriz com 2 loops.

    public static int matrizSoma6(int[][] matriz1) {
        int soma = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (i == 0 || i == 2 || i == 4) {
                    soma = soma + matriz1[i][j];
                }

            }
        }
        return soma;
    }
    //Metodo para calcular a soma da 6 matriz com 1 loops.

    public static int matrizSoma61(int[][] matriz1) {
        int soma = 0;
        for (int i = 0; i < 6; i++) {

            soma = soma + matriz1[0][i] + matriz1[2][i] + matriz1[4][i];

        }
        return soma;
    }
    //Metodo para calcular a soma da 1 matriz com 2 loops.

    public static int matrizSoma(int[][] matriz1) {
        int soma = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (i == 1 || i == 3) {
                    soma = soma + matriz1[i][j];
                }

            }
        }
        return soma;
    }

    //Metodo para calcular a soma da 1 matriz com 1 loops.
    public static int matrizSoma2(int[][] matriz1) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {

            soma = soma + matriz1[1][i] + matriz1[3][i];

        }
        return soma;
    }

    //Metodo para calcular a soma da 2 matriz com 2 loops.
    public static int matrizSoma3(int[][] matriz1) {
        int soma = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (j == 1 || j == 3) {
                    soma = soma + matriz1[i][j];
                }

            }
        }
        return soma;
    }
    //Metodo para calcular a soma da 2 matriz com 1 loops.

    public static int matrizSoma31(int[][] matriz1) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {

            soma = soma + matriz1[i][1] + matriz1[i][3];

        }
        return soma;
    }
    //Metodo para calcular a soma da 3 matriz com 2 loops.

    public static int matrizSoma4(int[][] matriz1) {
        int soma = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (i % 2 == 1 && j % 2 != 1) {
                    soma = soma + matriz1[i][j];
                }
                if (i % 2 != 1 && j % 2 == 1) {
                    soma = soma + matriz1[i][j];
                }

            }
        }
        return soma;
    }
    //Metodo para calcular a soma da 3 matriz com 1 loops.

    public static int matrizSoma41(int[][] matriz1) {
        int soma = 0;
        for (int j = 0; j < 4; j = j + 2) {

            soma = soma + matriz1[j][0] + matriz1[j][2] + matriz1[0][j] + matriz1[2][j];

        }
        return soma;
    }
    //Metodo para calcular a soma da 4 matriz com 2 loops.

    public static int matrizSoma5(int[][] matriz1) {
        int soma = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (i % 2 == 1 && j % 2 != 1) {
                    soma = soma + matriz1[i][j];
                }
                if (i % 2 != 1 && j % 2 == 1) {
                    soma = soma + matriz1[i][j];
                }

            }
        }
        return soma;
    }
    //Metodo para calcular a soma da 4 matriz com 1 loops.

    public static int matrizSoma51(int[][] matriz1) {
        int soma = 0;
        for (int j = 0; j < 4; j = j + 2) {

            soma = soma + matriz1[j][1] + matriz1[j][2] + matriz1[0][j] + matriz1[3][j];

        }
        return soma;
    }
    // metodo da 5 matriz com 1 loop
    public static int matrizsoma61(int [][] matriz1){
    
    int j = 0,num = 0,soma = 0;
    for(int i = 0;i<5;i++){
        if(i<2){
            j = j+1;
        soma = soma+matriz1[i][0+j]+num;
        soma = soma-matriz1[2][2];
        }
        else if(i>=2){
            j--;
    }
    }
    return soma;
    }
    // metodo que faz o somatorio e do -3 ao 26 e imprimi a matriz.

    public static int[][] matrizSomatorio() {
        int[][] matriz = new int[5][6];
        int x = -3;
        int soma = 0;
        //  {
        for(int i = 0;i<5;i++){
        for (int j = 0; j < 6; j++) {
            
        
        
            
              
                 
                
                matriz [i][j] = (x*x)+(4*x)-6;
                soma = soma + matriz[i][j];
                x++;
            
            
          
        }
          }
        for(int i = 0;i<5;i++){
        for (int j = 0; j < 6; j++) {
            if(j!=0)
                System.out.print(" ");
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
            
        }
        
        
        
            
        
        return matriz;
    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
        }
    }

    public static void main(String[] args) {
        //chamando o metodo do somatorio.
        matrizSomatorio();
        }
        
    

}
