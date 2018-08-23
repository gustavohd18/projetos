/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto1;

/**
 *
 * @author maivo
 */
public class Ponto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ponto p1 = new Ponto(2,2,3,3);
        p1.distancia();
        
        System.out.println(p1.distancia());
        System.out.println(p1.toString());
    }
    
}
