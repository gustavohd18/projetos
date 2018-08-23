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
public class CatalogoProdutos {
    private Produto[] p;
private int numProdutos;
private int numMaxProdutos=200;
  public CatalogoProdutos(){
    numProdutos=3;
    p=new Produto[numMaxProdutos];
    p[0]=new Produto(25,"Banana",7.99);
    p[1]=new Produto(24,"Maca",2.99);
    p[2]=new Produto(26,"Nescau",4.99);
  }
  public Produto getProduto(int c){
    for (int i=0;i<numProdutos;i++){
      if (p[i].getCodigo()==c){
        return p[i];
      }
    }
    return null;
  }
}
