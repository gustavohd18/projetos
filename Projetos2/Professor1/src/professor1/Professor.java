/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor1;

/**
 *
 * @author maivo
 */
public class Professor {
    private String nome;
    private int matricula;
    private int cargaHoraria;

    public Professor(String nome, int matricula, int cargaHoraria) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

   public void status(){
       System.out.println("nome:"+this.nome);
       System.out.println("matricula:"+this.matricula);
       System.out.println("carga horaria realizada"+this.cargaHoraria);
   }    
}
