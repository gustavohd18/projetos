/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author maivo
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private int vitoria;
    private int derrota;
    private int empates;
    private String categoria;
    public void apresentar(){
        System.out.println("chegou a hora apresentamos  o lutador "+ this.getNome());  
        System.out.println("direta mente de "+ this.getNacionalidade());
        System.out.println("com "+this.getIdade());
        System.out.println("pesando: "+this.getPeso());
        System.out.println(this.getVitoria()+"vitorias");
        System.out.println(this.getDerrota() + "derrota");
        System.out.println(this.getEmpates()+"empates");
    }
    public void status(){
        System.out.println(this.getNome()+"e um peso"+this.getCategoria());
        System.out.println("ganhou "+ this.getVitoria());
        System.out.println("perdeu "+this.getDerrota());
        System.out.println("empatou "+this.getEmpates());    
    }
    public void ganharluta(){
        this.setVitoria(this.getVitoria()+1);
    }
    public void perderluta(){
        this.setDerrota(this.getDerrota()+1);
    }
    public void empatarluta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derrota = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        this.categoria = categoria;
        if(this.peso<52.2){
            this.categoria = "invalido";
        }else if(this.peso<=70.3){
            this.categoria = "leve";
        }else if(this.peso<=83.9){
            this.categoria = "medio";
        }else if (this.peso<=120.2){
            this.categoria = "pesado";
        }else{
            this.categoria = "invalido";
        }
    }
    
}
