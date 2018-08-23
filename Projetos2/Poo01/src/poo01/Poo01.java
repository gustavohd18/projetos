/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo01;

/**
 *
 * @author maivo
 */
public class Poo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.setPonta(0.5);
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
        c1.status();
    }
    
}
