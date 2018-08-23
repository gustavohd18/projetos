/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author maivo
 */
public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("hahahahha");
    }
    public void reagir(String frase){
        if ("toma comida".equals(frase)||"ola".equals(frase)){
            System.out.println("abanar");
        }else
        {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora,int min){
        if(hora < 12 ){
            System.out.println("abanar");
        }else if (hora >=18)
        {
            System.out.println("ignorar");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("abanar");
        }else
        {
            System.out.println("rosnar e latir");
        }
    }
    public void reagir(int idade, float peso){
        if (idade<5) {
            if (peso< 10) {
                System.out.println("abanar");
            } else {
                System.out.println("latir");
            }
        } else {
            if (peso<10) {
                System.out.println("rosnar");
            } else {
                System.out.println("ignorar");
            }
        }
    }
}
