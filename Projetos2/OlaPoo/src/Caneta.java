/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maivo
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private int carga;
    private boolean tampada;
    void status(){
        System.out.println("modelo: "+ this.modelo);
        System.out.println("cor: "+ this.cor);
        System.out.println("ponta: "+ this.modelo);
        System.out.println("carga: "+ this.modelo);
        System.out.println("esta tampada "+this.tampada); 
    }
    public void rabiscar(){
        if(this.tampada==true){
            System.out.print("erro nao posso rabiscar");
        }else{
            System.out.print("escrevendo...");
        }
    }
    protected void tampar(){
        this.tampada=true;
    }
    protected void destampar(){
        this.tampada=false;
    }
}
