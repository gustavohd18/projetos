/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copes;

/**
 *
 * @author maivo
 */
public class Catalogo_Produto {
 private Produto[] produtos1;
    public Catalogo_Produto() {
          Produto produtos[] = new Produto[3];
          Produto p1 = new Produto(123,"fruta de uva",2.00); 
          Produto p2 = new Produto(124,"fruta de maca",3.00);
          Produto p3 = new Produto(125,"fruta de morango",4.00);
         produtos[0] = p1;
         produtos[1] = p2;
         produtos[2] = p3;
         
        produtos1 = produtos; 
    }

    public Produto[] getProdutos1() {
        return produtos1;
    }

    public void setProdutos1(Produto[] produtos1) {
        this.produtos1 = produtos1;
    }
    
    public boolean pesquisa(int cod){
                
        for(int i = 0;i<produtos1.length;i++){
            if(cod == produtos1[i].getCodigo()){
                return true;
            }
               
            
        }
     return false;}
    
    public String descricao(int cod){
        String re = "";

        if(pesquisa(cod)==true){
              
                  for(int i = 0;i<produtos1.length;i++){
             if(cod == produtos1[i].getCodigo()){
            re = produtos1[i].getDescricao();
         }
         }
        }
   return re; }
        
    public Double total3(int cod,int quanti){
        Double total2 = 0.0;

        if(pesquisa(cod)==true){
                
                  for(int i = 0;i<produtos1.length;i++){
             if(cod == produtos1[i].getCodigo()){
            total2 = produtos1[i].getPreco()*quanti;
         }
         }
        }
   return total2; }
    
}
