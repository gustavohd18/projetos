/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a222;

/**
 *
 * @author maivo
 */
public class Aluno2 {
    private String nome,matricula;
    private double p1,p2,p3,me;
    private int frequencia;

    public Aluno2(String nome, String matricula, double p1,double p2,double p3, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.me = media;
        
    }
    public double media(){
        double aux = (p1*1+p2*2+p3*3+me*1)/7;
        return aux;
    }
    public boolean faltas(){
        if(frequencia<=16){
            return true;
        }else{
            return false;
        }
    }
    public String situacaoG1(){
        double aux = media();
        if((aux >=7)&&(faltas())){
        return "aprovado";
    }else if((aux>=4 && aux <7)&&(faltas())){
        return "em g2";
    }else{
        return "reprovado";
    }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public double getMe() {
        return me;
    }

    public void setMe(double me) {
        this.me = me;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    
}
