/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author maivo
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        p[0]= new Pessoa("gustavo",22,"m");
        p[1] = new Pessoa("erica",23,"f");
        l[0]= new Livro("harry potter","jj",300,p[0]);
        l[1]= new Livro("harry potter 2 ","jj",400,p[1]);
        l[2]= new Livro("harry potter 3 ","jj",600,p[1]);
        
        System.out.println(l[0].detalhes());
        
        
        
    }
    
}
