/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maivo
 */
public class AreaLaterais {

    public AreaLaterais() {
    }
    
    public  double aLcubo(double lado)
   {
     return(4*lado*lado);
    }
    
    public  double aLesfera(double raio)
   {
     return(4*Math.pow(Math.PI,2)*raio*raio);
    }
   //revisar essa e a proxima
    public  double aLcilindro(double raio,double altura,double base)
   {
     return(2*Math.pow(Math.PI,2)*raio*altura)/base;
    }
   
    public  double aLcone(double raio,double geratriz)
     {
     return(Math.pow(Math.PI,2)*raio*geratriz);
    }
   
   public  double aLparalelepipedo(double lado,double comprimento1,double comprimento2,double altura)
   { 
     return (2*(lado*comprimento1))+(2*(comprimento2*altura));
   }
   
    public  double menorMaiorquetres(double numero)
   {  
     return 0 ;
   }
}
