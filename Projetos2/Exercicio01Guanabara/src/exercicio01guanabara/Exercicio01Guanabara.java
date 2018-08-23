/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01guanabara;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author maivo
 */
public class Exercicio01Guanabara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date data = new Date();
        Locale local = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d =  tk.getScreenSize();
        System.out.println(data);
        System.out.println(local);
        System.out.println(d.height);
        System.out.println(d.width);
        
    }
    
}
