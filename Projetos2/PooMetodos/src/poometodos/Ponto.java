/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poometodos;

/**
 *
 * @author maivo
 */
public class Ponto {
    private double x;
    private double y;
    public Ponto() {
        x = 0;
        y = 0;
    }
    public Ponto(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Ponto(double x1,double x2,double y1,double y2){
        this.x = x2-x1;
        this.y = y2-y1;
    }
    public static double pontos(double p1, double p2){
        return p2-p1;
    }
    
}
