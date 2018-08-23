/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosprontos;

import java.util.Scanner;
class Biblioteca{
   //AREAS FIGURAS PLANAS
   public static double areaQuadrado(double lado)
   {
     return lado*lado;
    }
   
   public static double areaTriangulo(double base,double altura)
    {
     return (base*altura)/2;
    }
   
   public static double areaRetangulo(double base,double altura)
    {
     return (base*altura);
    }
   
   public static double areaCirculo(double raio)
    {
     return Math.pow(Math.PI,2)*raio*raio;   
    }    
   
    //VOLUME SOLIDOS
   public static double vCubo(double lado)
   {
       return lado*lado*lado;
    }
   
   public static double vEsfera(double raio)
   {
       return (4*Math.pow(Math.PI,2)*raio*raio*raio)/3;
    }
   
   public static double vCilindro(double areabase,double altura)
   {
     return(areabase*altura);
    }
   
   public static double vCone(double areabase,double altura)
   {
     return(areabase*altura)/3;
    } 
   
   public static double vParalelepipedo(double base,double altura,double comprimento)
   {
     return(base*altura*comprimento);
    } 
    
   public static double vPiramide(double areabase,double altura)
   {
     return(areabase*altura)/3;
    }
   //BASES DA PIRAMIDE
   
   public static double bTriangulo(double base,double altura)
   {
     return(base*altura)/2;
    }
   
   public static double bQuadrangular(double comprimento,double largura)
   {
     return(comprimento*largura);
    }
  
    public static double b(double comprimento,double largura)
   {
     return(comprimento*largura);
    }
    
   //AREA LATERAL(SUPERFICIE)
   
   public static double aLcubo(double lado)
   {
     return(4*lado*lado);
    }
    
    public static double aLesfera(double raio)
   {
     return(4*Math.pow(Math.PI,2)*raio*raio);
    }
   //revisar essa e a proxima
    public static double aLcilindro(double raio,double altura,double base)
   {
     return(2*Math.pow(Math.PI,2)*raio*altura)/base;
    }
   
    public static double aLcone(double raio,double geratriz)
     {
     return(Math.pow(Math.PI,2)*raio*geratriz);
    }
   
   public static double aLparalelepipedo(double lado,double comprimento1,double comprimento2,double altura)
   {  
     return (2*(lado*comprimento1))+(2*(comprimento2*altura));
   }
   
    public static double menorMaiorquetres(double numero,double n2,double n3)
   {  
     //return ??????????????? ;
       if (numero> n2 && numero > n3){
           return numero;
       }else if (n2> numero && n2 > n3){
       return n2;
   }else{
           return n3;
       }
   }
  // par/impar 
    public static boolean parInpar(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
     
  public double calculaPa(int x, int n, int c){
      int count = 1;
        double an = 0;
    while(count <= n){
      an = x + (n-1)*c;
      count++;
      
    }
    return an;
  }
     
   }
  
   
   
     ////maior/menor de 3 ->int    -retorna vetor
         //                ->double
          
   
      // multiplo/divisor -retorna boolean
   