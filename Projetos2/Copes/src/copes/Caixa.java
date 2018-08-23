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
public class Caixa {
    Catalogo_Produto catalogo = new Catalogo_Produto();
    private  double total_vendido;
   

    public Caixa() {
        this.total_vendido = 0;
    }

    public Catalogo_Produto getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo_Produto catalogo) {
        this.catalogo = catalogo;
    }

   

    
    
    public double getTotal_vendido() {
        return total_vendido;
    }

    public void setTotal_vendido(double total_vendido) {
        this.total_vendido = total_vendido;
    }
    public double total(int cod1, int quantidade1){
        
        
                total_vendido=(catalogo.total3(cod1,quantidade1)+getTotal_vendido());
                 double total =total_vendido;
        return total;
    }
    public void relatorio(int cod,int quantidade){
        String b = "";
        int quantidade2 = 0;
        double ree = 0.0;
        
            for(int i = 0;i<catalogo.getProdutos1().length;i++){
                if(cod==catalogo.getProdutos1()[i].getCodigo()){
               
           b = catalogo.getProdutos1()[i].getDescricao();
          quantidade2 = quantidade;
          ree = total(cod,quantidade);
         
                
        }
            
    }
            System.out.println("o codigo do produto e "+cod+" descricao "+b+" a quantidade do produto e "+quantidade2+" e o total de vendas do produto e "+ree);
    
}
}
