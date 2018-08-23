
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maivo
 */
public class MetodosDiversos {
    private double base;
    private double altura;
    private double lado;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public static double areaTriangulo(double base,double altura){
        return(base*altura)/2;
    }
    public static double areaQuadrado(double lado){
        return lado*lado;
    }
    public static double areaRetangulo(double base,double altura){
        return base*altura;
    }
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor da base do triangulo:");
        double valorbase = teclado.nextDouble();
        System.out.println("digite o valor da altura do triangulo: ");
        double valoraltura = teclado.nextDouble();
        double resultado = areaTriangulo(valorbase,valoraltura);
        System.out.println(resultado);
    }
    public int[] somaVetores(int [] vetor, int [] vetor2){
        int [] soma = new int [vetor.length];
    for (int i = 0; i < vetor.length;i++) {
        soma[i]= vetor[i]+vetor2[i];
    }
    return soma;
    }

}
