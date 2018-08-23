/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio011;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Desafio011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("diga qual a largura da parede");
        double largura = teclado.nextDouble();
        System.out.println("diga qual a altura da parede");
        double altura = teclado.nextDouble();
        double area = largura * altura;
        int litro =(int) area / 2;
        
        System.out.println("sua parede tem a dimensao "+largura+" x "+altura+" e sua area e de "+area);
        System.out.println("para pintar essa parede sera necessario "+litro+" litros de tinta ");
        
        
        
    }
    
}
