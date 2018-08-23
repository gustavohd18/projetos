/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciomatrizdosite;

/**
 *
 * @author maivo
 */
public class Exerciciomatrizdosite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notasAluno = new double[30][4];
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
        notasAluno[4][0] = 8;
        notasAluno[4][1] = 3;
        notasAluno[4][2] = 2;
        notasAluno[4][3] = 9;
        
        double soma;
          for (int i = 0; i < notasAluno.length; i++) {
              soma = 0;
            for (int j = 0; j < notasAluno[0].length; j++) {

                soma+=notasAluno[i][j];

            }
            System.out.println("media do aluno  "+i + "e"+(soma/4));
        }

        for (int i = 0; i < notasAluno.length; i++) {
            for (int j = 0; j < notasAluno[0].length; j++) {

                System.out.print(notasAluno[i][j] + " ");

            }
            System.out.println();
        }

    }
}
