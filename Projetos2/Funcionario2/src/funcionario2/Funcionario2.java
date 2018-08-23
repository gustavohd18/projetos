/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario2;

/**
 *
 * @author maivo
 */
public class Funcionario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario p1 = new Funcionario("gustavo","1720",1100,30,2);
        
        double re = p1.salarioLiquido();
        System.out.println(re);
        
        
    }
    
}
