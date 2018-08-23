/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melhorada;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Melhorada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList lista = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite o primeiro valor: ");
        int a = teclado.nextInt();
        System.out.println("digite outro numero: ");
        int b = teclado.nextInt();
        System.out.println("digite o outro numero: ");
        int c = teclado.nextInt();
    lista.add(a);
    lista.add(b);
    lista.add(c);
        System.out.println(Collections.min(lista));
  
    }
    
}
