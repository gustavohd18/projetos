/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto1;

/**
 *
 * @author  gustavo duarte
 *
 */
public class Ponto {
    private double x;
    private double y;
    private double x1;
    private double y1;
    public Ponto(double x, double y,double x1,double y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }
    
    
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
    public double distancia(){
        double d1 = (this.x-this.x1)*(this.x-this.x1);
        double d2 = (this.y-this.y1)*(this.y-this.y1);
        double soma = d1 + d2;
        double distancia = Math.sqrt(soma);
        
        return distancia;
    }
}
