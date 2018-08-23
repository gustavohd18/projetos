/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olapoo;

/**
 *
 * @Gustavo Duarte
 */
class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    public void status(){
        System.out.println("modelo: "+this.getModelo());
        System.out.println("cor: "+this.cor);
        System.out.println("ponta: "+this.ponta);
        System.out.println("carga: "+this.carga);
        System.out.println("esta tampada: "+this.tampada);
    }
     public void rabiscar(){
        if(this.tampada==true){
            System.out.print("erro nao posso escrever");
        }else{
            System.out.print("escrevendo...");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada=false;
    }
}
