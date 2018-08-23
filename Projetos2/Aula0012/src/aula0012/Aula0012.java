/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0012;

/**
 *
 * @author maivo
 */
public class Aula0012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        
        m.setPeso(65.2f);
        m.setCorPelo("marron");
        m.alimentar();
        m.emitirSom();
        
        r.alimentar();
        r.emitirSom();
    }
    
}
