/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author maivo
 */
public class Produto{
    private int codigo;
    private String descricao;
    private double preco;
    
    public Produto(int umCod,String umaDescr,double umPreco){
        codigo = umCod;
        descricao = umaDescr;
        preco = umPreco;
    }
    
    public int getCodigo(){
        return(codigo);
    }
    
    public String getDescricao(){
        return(descricao);
    }
    
    public double getPrecoUnitario(){
        return(preco);
    }
    
    public String toString(){
        return(getCodigo()+": "+getDescricao()+", R$ "+getPrecoUnitario());
    }
}

