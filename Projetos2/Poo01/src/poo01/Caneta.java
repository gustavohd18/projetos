/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo01;

/**
 *
 * @author maivo
 */
public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
     protected int carga;
    protected boolean tampada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("escrevendo");
        }else{
            System.out.println("n posso");
        }
    }
    public void tampar(){
        this.tampada= true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("uma caneta: "+this.cor);
        System.out.println("uma caneta: "+this.ponta);
        System.out.println("uma caneta: "+this.modelo);
        System.out.println("uma caneta: "+this.carga);
        System.out.println("uma caneta: "+this.tampada);
    }
}
