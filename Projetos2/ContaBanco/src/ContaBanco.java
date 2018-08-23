
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println("conta:"+this.getNumConta());
        System.out.println("dono:"+this.getDono());
        System.out.println("tipo"+this.getTipo());
        System.out.println("saldo:"+this.getSaldo());
        System.out.println("status:"+this.isStatus());
    }
    
    public void trasferencia(ContaBanco getnumConta,double v){
        
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("cc".equals(t)){
            this.setSaldo(50);
           
        }else if("cp".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso");
    }
    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("conta nao pode ser fechado pois ainda tem money");
        }else if(this.getSaldo()<0){
            System.out.println("conta nao pode ser fechada pois tem debito");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("deposito realizado com sucesso na conta"+this.getDono());
        }else{
            System.out.println("impossivel depositar numa conta fechada");
        }
    }
    public void sacar(float v){
        if(this.isStatus()){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("saque realizado na conta de "+this.getDono());
            }else{
                System.out.println("saldo insuficiente para saldo");
            }
        }else{
            System.out.println("impossivel sacar de uma conta fechada");
        }
            
    }
    public void pagarMensal(){
        int v = 0;
        if("cc".equals(this.getTipo())){
            v = 12;
        }else if("cp".equals(this.getTipo())){
            v = 20;
        }
        if(this.isStatus()){
            this.setSaldo(this.getSaldo()- v );
            System.out.println("mensalidade paga com sucesso por "+this.getDono());
        }else{
            System.out.println("impossivel pagar uma conta fechada");
        }
    }

    public ContaBanco() {
        this.saldo= 0;
        this.status=false;
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void trasferir(ContaBanco p, float v){
        p.sacar(v);
        depositar(v);
        
    }
    
    
}
