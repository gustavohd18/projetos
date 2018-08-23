/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maivo
 */
public class Aredonda {
    public static void arredonda(){
        double valor= 4.6;
        int aux = (int)valor;
        double decimal = valor-aux;
        if (decimal>5){
            return aux+1;
           
        }else{
            return aux;
        }
    }
    
}
