/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girrafa008;

/**
 *
 * @author Gustavo Duarte
 */
public class Fracao {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Fracao{" + "a=" + a + ", b=" + b + '}';
    }
    
    public double getValor(){
        double fracao = this.a / this.b;
        return fracao;
    }
    public double multi(double num1,double num2,double num3 ,double num4){
        double f1 = num1/num2;
        double f2 = num3/num4;
        double multi = f1 *  f2;
        return multi;
        
    }
    public double soma(double num1,double num2,double num3 ,double num4){
        double f1 = num1/num2;
        double f2 = num3/num4;
        double soma = f1 + f2;
        return soma;
        
}
}
