/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.matrizes;

/**
 *
 * @author maivo
 */
public class ExercicioMatrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notasAluno = new double[4][4];
        notasAluno[0][0] = 10;
        notasAluno[0][1] = 7;
        notasAluno[0][2] = 5;
        notasAluno[0][3] = 2;
        notasAluno[1][0] = 8;
        notasAluno[1][1] = 3;
        notasAluno[1][2] = 2;
        notasAluno[1][3] = 9;
        notasAluno[2][0] = 8;
        notasAluno[2][1] = 3;
        notasAluno[2][2] = 2;
        notasAluno[2][3] = 9;
        notasAluno[3][0] = 8;
        notasAluno[3][1] = 3;
        notasAluno[3][2] = 2;
        notasAluno[3][3] = 9;

        double maior = 0;
        int linha = 0;
        int coluna = 0;
        double maiorlinha = 0;
        double menorlina = 0;
        double maiorcoluna = 0;
        double menorcoluna = 100;
        for (int i = 0; i < notasAluno.length; i++) {

            for (int j = 0; j < notasAluno[0].length; j++) {

                if (notasAluno[i][j] > maior) {
                    maior = notasAluno[i][j];
                    linha = i;
                    coluna = j;

                    
                }
                if (notasAluno[0][j] > maiorlinha) {
                        maiorlinha = notasAluno[0][j];
                        

                    }
                menorlina = maiorlinha;
                    if (notasAluno[0][j] < menorlina) {
                        menorlina = notasAluno[0][j];

                    }
                    if (notasAluno[i][2] > maiorcoluna) {
                        maiorcoluna = notasAluno[i][2];

                    }
                    if (notasAluno[i][2] < menorcoluna) {
                        menorcoluna = notasAluno[i][2];

                    }


            }

        }

        for (int i = 0; i < notasAluno.length; i++) {
            for (int j = 0; j < notasAluno[0].length; j++) {

                System.out.print(notasAluno[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("a maior nota de um aluno é " + maior);
        System.out.println("e a posicao que ele se encontra e na linha " + linha + " e na coluna " + coluna);
        System.out.println("o maior valor da linha 1 e  "+maiorlinha);
        System.out.println("o menor valor da linha 1 e "+menorlina);
        System.out.println("o maior valor da coluna 4 e "+maiorcoluna);
        System.out.println("o menor valor da coluna 4 e "+menorcoluna);

    }

}
