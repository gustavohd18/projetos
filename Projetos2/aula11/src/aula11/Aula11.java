/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author maivo
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitante v1 = new Visitante();
        v1.setNome("gustavo");
        v1.setIdade(23);
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("erica");
        a1.setMatricula(1720);
        a1.setCurso("cc");
        a1.setSexo("m");
        System.out.println(a1.toString());
        
        
    }
    
}
