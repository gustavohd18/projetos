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
public class Bolsista extends Aluno {
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("renovando bolsa de "+this.getNome());
        
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+"e bolsista pagamendo facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
