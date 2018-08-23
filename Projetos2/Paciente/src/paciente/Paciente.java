/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paciente;

/**
 *
 * @author maivo
 */
public class Paciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Paciente1 p1 = new Paciente1("maria",11111111,33330286,"unimed","febre",2);
        Paciente1 p2 = new Paciente1("joao",2222222,33330287,"golden cross","taquicardia",3);
        
        System.out.println(p1.toString());
         System.out.println(p2.toString());
        p1.setDiagnostico("avc");
        p2.setConvenio("bradesco saude");
        
        System.out.println(p1.toString());
         System.out.println(p2.toString());

        
        p1.consulta(15);
        p2.consulta(15);
        System.out.println("o valor da consulta e"+p1.consulta(15));
        System.out.println("o valor da consulta e"+p2.consulta(15));
    }
    
}
