/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimo1;

/**
 *
 * @author maivo
 */
public class Emprestimo {
    private double totalEmprestimo;
    private double taxaJuros;
    private double parcelas;

    public double getTotalEmprestimo() {
        return totalEmprestimo;
    }

    public void setTotalEmprestimo(double totalEmprestimo) {
        this.totalEmprestimo = totalEmprestimo;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getParcelas() {
        return parcelas;
    }

    public void setParcelas(double parcelas) {
        this.parcelas = parcelas;
    }
    public double pagamentoMensal(){
        double mensal = ((this.totalEmprestimo/this.parcelas)*this.taxaJuros);
        return mensal;
    }
    public double totalMensal(){
        double total = pagamentoMensal()*this.parcelas;
        return total;
    }
}
