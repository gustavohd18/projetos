/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroexemplo;

/**
 *
 * @author gustavo
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println("conta: "+this.getNumConta());
        System.out.println("dono:" + this.getDono());
        System.out.println("saldo: "+this.getSaldo());
        System.out.println("tipo: "+ this.getTipo());
        System.out.println("status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
       if(t == "CC"){
           this.setSaldo(50);
       } else if(t == "CP"){
           this.setSaldo(150);
       }
       System.out.print("conta aberta com sucesso");
    }
    public void fecharConta(){
        if(this.getSaldo()> 0){
            System.out.print("conta nao pode ser fechado pois ainda tem dinheiro");
        }else if (this.getSaldo()<0){
            System.out.print("nao pode ser fechada pois a conta tem debito");
        }else{
            this.setStatus(false);
            System.out.print("conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("deposito realizado na conta de "+this.getDono());
        }else{
            System.out.println("impossivel depositar numa conta fechada!");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("saque realizado na conta de "+ this.getDono());
            }else{
                System.out.println("saldo insuficiente para saque");
            }
        }else{
            System.out.println("impossivel sacar de uma conta inativa");
        }
    }
    public void pagarMensal(){
        int v;
        if(this.getTipo()=="CC"){
            v = 12;
        }else{
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("mensalidade paga com sucesso "+ this.getDono());
        }
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
