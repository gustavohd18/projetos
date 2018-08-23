/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefone1;

/**
 *
 * @author maivo
 */
public class Telefone {
    private int numero;
    private String nome;
    private int cpf;
    private double tarifaBasica;
    private int totalMinuto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getTarifaBasica() {
        return tarifaBasica;
    }

    public void setTarifaBasica(double tarifaBasica) {
        this.tarifaBasica = tarifaBasica;
    }

    public int getTotalMinuto() {
        return totalMinuto;
    }

    public void setTotalMinuto(int totalMinuto) {
        this.totalMinuto = totalMinuto;
    }
    public double totalMensal(){
        double tot = this.totalMinuto*1.20+this.tarifaBasica;
        
        return tot;
        
    }

    @Override
    public String toString() {
        return "Telefone{" + "numero=" + numero + ", nome=" + nome + ", cpf=" + cpf + ", tarifaBasica=" + tarifaBasica + ", totalMinuto=" + totalMinuto + '}';
    }
    
}
