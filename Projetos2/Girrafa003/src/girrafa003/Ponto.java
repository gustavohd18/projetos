/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girrafa003;

/**
 *
 * @author gustavo
 */
public class Ponto {
    private double x;
    private double y;
    private double d;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void deslocar(double dx, double dy){
        this.x = dx;
        this.y = dy;
               
    }
    public String ponto(){
        String coordenada = "("+x+","+y+")";
        return coordenada;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    
    
}
