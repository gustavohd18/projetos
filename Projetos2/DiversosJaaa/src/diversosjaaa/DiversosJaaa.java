package diversosjaaa;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class DiversosJaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("digite seu nome");
        String nome = teclado.next();
        System.out.println(nome);
        if (nome .equalsIgnoreCase ("gustavo")){
    
            System.out.println("bem vindo o cara  mais lindo da pucrs");
        }   
        else{
            System.out.println("vc e muito feio");
        }
         
    }
    
}
