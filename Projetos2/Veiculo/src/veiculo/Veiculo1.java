/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

/**
 *
 * @author gustavo
 */
public class Veiculo1 {
    private int placa;
    private String modelo;
    private String marca;
    private int ano;

    public Veiculo1(int placa, String modelo, String marca, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo1{" + "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + '}';
    }
    
    public void placa1(){
        System.out.println(this.placa);
    }
    public void modelo1(){
        System.out.println(this.modelo);
    }
    public void marca(){
        System.out.println(this.marca);
        
    }
    public void ano(){
        System.out.println(this.ano);
    }
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
