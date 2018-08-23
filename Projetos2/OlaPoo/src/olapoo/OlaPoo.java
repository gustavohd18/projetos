/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olapoo;

/**
 *
 * @author maivo
 */
public class OlaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo = "big cristal";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        Caneta c2  = new Caneta();
        c2.setPonta(0.5f);
        c2.setModelo("big");
        System.out.println("tenho uma caneta "+c2.getModelo());
        
    }
    
}
