/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundo2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author maivo
 */
public class OlaMundo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date data = new Date();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        Locale loc = Locale.getDefault();
        System.out.println("sua tela tem resolucao "+lar+"x"+alt);
        System.out.println(data.toString());
        System.out.println(loc);
        System.out.println("ola mundo!");
    }
    
}
