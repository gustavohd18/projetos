/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaexemplogirrafa;

import java.util.Scanner;

/**
 *
 * @author gustavo duarte
 * 
 */
public class ProgramaExemploGirrafa {

    /**
     * @param args the command line arguments
     * 
     */
    public static double areaTriangulo(double base ,double altura){
        double aux = base * altura;
                return aux;
    }
    public static double areaQuadrado(double lado){
        return lado * lado;
    }
    public static double volumePiramide(double areaB,double alturaP){
        return(areaB*alturaP)/3;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n[1]para calculo da area \n[2] area triangulo\n[3] calculo retangulo \n[4] calculo piramede \n[5]area do volume da piramide com base quadrada\n[6] area base retangular");
        int opcao = teclado.nextInt();
        switch (opcao){
            case 1:
                System.out.println("informe o valor  do lado do quadrado:");
                double lado1 = teclado.nextDouble();
                System.out.println("a area e "+areaQuadrado(lado1));
                break;
                
            case 2:
            System.out.println("informe o valor  da base:");
            double base1 = teclado.nextDouble();
                System.out.println("informe o valor da altura");
                double altura1= teclado.nextDouble();
                
                break;
                
        }
        
    }
    
}
