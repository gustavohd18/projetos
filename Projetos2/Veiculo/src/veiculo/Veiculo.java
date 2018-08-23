/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

/**
 *
 * @author maivo
 */
public class Veiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo1 v1 = new Veiculo1(1234,"ka","ford",2004);
        
        v1.getPlaca();
        v1.placa1();
           v1.setPlaca(323232);
           v1.placa1();
    }
    
}
