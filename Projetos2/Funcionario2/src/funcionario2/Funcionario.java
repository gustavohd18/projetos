/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario2;

/**
 *
 * @author maivo
 */
public class Funcionario {
    private String nome;
    private String matricula;
    private double salarioBase;
    private int horasTrabalhadas;
    private int horaExtra;

    public Funcionario(String nome, String matricula, double salarioBase,int hora, int hora1) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = hora;
        this.horaExtra = hora1;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }
    

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double salarioLiquido(){
        double hora = this.horaExtra * 20;
        double salario = this.salarioBase+ hora;
        return salario;
    }
}
