/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Ai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
         Aluno2 l2 = new Aluno2("gustavo","17204295-4",6.1,8.1,10.0,8,92);
         Aluno2 l1 = new Aluno2("julia","18234354-2",7.2,9,6,9,96);
         Aluno2 vetor[];
         vetor = new Aluno2[5];
         l2.status();
         l2.setNome("pedro");
         l2.setMatricula("12012030123012-3");
                 l2.setFrequencia(100);
                 l2.setP1(10);
         l2.status();
         int[] um = new int[3];
         String[] dois = new String[3];
         Aluno2 [] tres = new Aluno2[3];
         for (int i = 0;i<um.length;i++){
             System.out.println("digite o valor inteiro");
             int valor = teclado.nextInt();
             um[i] = valor;
         }
         System.out.println();
         for (int i = 0;i<dois.length;i++){
             System.out.println("digite o texto");
             String valor = teclado.nextLine();
             dois[i] = valor;
         }
          for (int i = 0;i<tres.length;i++){
              teclado.next();
             System.out.println("digite o nome");
             String nome = teclado.nextLine();
             System.out.println("digite a matricula");
             String matricula = teclado.nextLine();
             System.out.println("digite a p1");
             int p = teclado.nextInt();
             System.out.println("digite a p1");
             int p1 = teclado.nextInt();
             System.out.println("digite a p1");
             int p2 = teclado.nextInt();
             System.out.println("digite a p1");
             int media = teclado.nextInt();
             System.out.println("digite a frequencia");
             int frequencia = teclado.nextInt();
             Aluno2 aux = new Aluno2(nome,matricula,p,p1,p2,media,frequencia);
             tres[i] = aux;
         }
          System.out.println("o segundo elemento do vetor um e "+um[1]);
          System.out.println("o segundo elemento do vetor um e "+tres[0].toString());
          System.out.println("o segundo elemento do vetor um e "+tres[1].getNome().length());
     
    }
    
}
