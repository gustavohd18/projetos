/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2;

import java.util.Random;

/**
 *
 * @author maivo
 */
public class Exe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random gera = new Random();
        for(int i = 0;i<5000;i++){
            System.out.println(gera.nextInt(101));
        }
    }
    
}
