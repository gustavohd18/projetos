/*
 * Gustavo Hernandez Duarte, Gustavo Pias, Caio , João.
 */
package girrafa;

public class Girrafa {
// método para retorna o maior elemento da linha onde tem o menor elemento da matriz
public static int e(int matriz[][]) {
        
        // variavel que verifica qual o menor valor da matriz 
        int menor = matriz[0][0];
        //variavel que verifica qual o maior elemento da linha
        int maior = 0;
        // váriavel que guarda o maior valor temporamente para depois comparar com todos os valores da Matriz.
        int aux;
        for(int i=0; i<matriz.length; i++){
            // auxiliar recebe o metodo que pega o menor valor da matriz
            aux = getMenor(matriz[i]);
            // Faz a comparação  que se o aux for menor que o menor o maior recebe o metodo que pega o maior da matriz e o menor recebe matriz
            if(aux < menor){
                maior = getMaior(matriz[i]);
                menor = aux;
            }else if(aux == menor){
                menor = aux;
                int auxMaior = getMaior(matriz[i]);
                if(auxMaior>maior){
                    maior = auxMaior;
                }
            }
        }
        return maior;
        
    }

    //Método que pega o menor elemento de um vetor.
    public static int getMenor(int[] vetor){
        int menor = vetor[0];
        for(int i=0; i<vetor.length; i++){
            if(menor > vetor[i]){
                menor = vetor[i];
            }
        }
        return menor;
    }
    //Método que pega o maioro de um vetor.
    public static int getMaior(int[] vetor){
        int maior = vetor[0];
        for(int i=0; i<vetor.length; i++){
            if(maior < vetor[i]){
                maior = vetor[i];
            }
        }
        return maior;
    }


    public static void main(String[] args) {
        

        int[][] matriz2 = new int[3][3];
        matriz2[0][0] = 10;
        matriz2[0][1] = 9;
        matriz2[0][2] = 1;
        matriz2[1][0] = 1 ;
        matriz2[1][1] = 2;
        matriz2[1][2] = 3;
        matriz2[2][1] = 1;
        matriz2[2][0] = 2;
        matriz2[2][2] = 2;
        // imprimi a matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {

                System.out.print(matriz2[i][j] + " ");

            }
            System.out.println();
        }
        // imprimi e chama o método que retorna o maior elemento de uma linha da matriz onde tem o menor elemento.
        System.out.println(e(matriz2));
    }

}
