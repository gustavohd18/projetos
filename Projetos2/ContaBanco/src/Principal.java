/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maivo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("gustavo");
        p1.abrirConta("cc");
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("erica maciel");
        p2.abrirConta("cp");
        
        
        p1.depositar(100);
        p2.depositar(1000);
        p1.estadoAtual();
        p2.estadoAtual();
        p1.trasferir(p2,100);
        p1.estadoAtual();
        p2.estadoAtual();
        
       
    }
    
}
