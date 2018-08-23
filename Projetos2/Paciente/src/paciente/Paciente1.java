/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paciente;

/**
 *
 * @author Gustavo Duarte
 */
public class Paciente1 {
    private String nome;
    private int cpf;
    private int telefone;
    private String convenio;
    private String diagnostico;
    private int numero_consulta;

    public Paciente1(String nome, int cpf, int telefone, String convenio, String diagnostico, int numero_consulta) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.convenio = convenio;
        this.diagnostico = diagnostico;
        this.numero_consulta = numero_consulta;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getNumero_consulta() {
        return numero_consulta;
    }

    public void setNumero_consulta(int numero_consulta) {
        this.numero_consulta = numero_consulta;
    }

    @Override
    public String toString() {
        return "Paciente1{" + "nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", convenio=" + convenio + ", diagnostico=" + diagnostico + ", numero_consulta=" + numero_consulta + '}';
    }
    public double consulta(double v){
        double valor = this.numero_consulta*v;
        
        return valor;
    }
    
}
