/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

/**
 *
 * @author maivo
 */
public class Pessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("gustavo");
     
        p3.setNome("maria");
        p1.setSexo("m");
        p3.setSexo("f");
        
        p3.setSalario(2500.75f);
     
        p4.setNome("luciana");
        System.out.println(p1.toString());
        System.out.println(p3.toString());
        
    }
    
}
