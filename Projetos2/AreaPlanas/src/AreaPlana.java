/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maivo
 */
public class AreaPlana {
   //AREAS FIGURAS PLANAS
   //fazer as areas planas uma classe uma classe das areas laterais solido e uma classe das volumes solidos. 
    
   public AreaPlana()
   {
       
    }

    public double areaQuadrado(double lado) {
        return lado*lado;
    }
   
   public  double areaTriangulo(double base,double altura)
    {
     return (base*altura)/2;
    }
   
   public  double areaRetangulo(double base,double altura)
    {
     return (base*altura);
    }
   
   public double areaCirculo(double raio)
    {
     return Math.pow(Math.PI,2)*raio*raio;   
    }    
   
}