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
public class Registradora {
     private double totalVendido;
  private CatalogoProdutos catalog;
  private String[]re = new String[200];
  private int cod_venda;
 

  public Registradora(CatalogoProdutos c){
    this.catalog = c;
    totalVendido = 0;
  }
  public double registraVenda(int cod,int qtd){
    Produto prod = catalog.getProduto(cod);
    if(prod==null){
      return -1;
    }
    else{
      double venda = (prod.getPrecoUnitario()*qtd);
      totalVendido+= venda;
      return venda;
    }
  }
  public double getTotalVendido(){
    return totalVendido;
  }
  public void adicionar(int quantidade,int cod,double venda){
     Produto prod = catalog.getProduto(cod);
    if(prod==null){
        System.out.println("nao foi possivel adicionar nada");
    }
    else{
      
     int cod1 = cod;
     String descricao = prod.getDescricao();
     double preco = prod.getPrecoUnitario();
     int quanti = quantidade;
     double venda1 = venda;
     
     String tudo = "codigo "+Integer.toString(cod)+" descricao "+descricao+" quantidade "+Integer.toString(quanti)+" preco total da venda "+Double.toString(venda);
    re[0+cod_venda] = (tudo);
    cod_venda+=1;
        
}
  }
    public void rela(){
         for (int i=0;i<cod_venda;i++){
             System.out.println(re[i]);
         }
    }
    }
  

