/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapucrs;

/**
 *
 * @author maivo
 */
public class AulaPucrs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float s0 = 2.0f ;
        float v0 = 4.0f;
        float t = 1.0f;
        float g = 2.0f;
        //double s1 = (s0 + v0*t)+((1/2)*g*(t*t));
        //int a = 4;
        //int b = 5;
        //int y = 4;
        //double c = Math.sqrt((a*a)+(b*b)-(2*a*b)*(Math.cos(y)));
        double fv = s0*Math.pow((1+v0/100),g);
        double y = 4*3.14*3.14*(Math.pow(v0, 3)/t*t*(s0+s0));
        
        float p = 19.93f;
        float q = 20.00f;
        double d = q - p;
        System.out.printf("o numero formatado e %.2f ",d);
        
        
        
        
        
        
        
        
        
 
        
        
        
        
    }
    
    
}
