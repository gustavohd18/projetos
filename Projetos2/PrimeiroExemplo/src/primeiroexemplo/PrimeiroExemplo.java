/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroexemplo;

/**
 *
 * @author maivo
 */
public class PrimeiroExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(150);
        p1.sacar(100);
        p1.estadoAtual();
    }
    
}
