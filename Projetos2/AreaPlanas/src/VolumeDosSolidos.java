/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maivo
 */
public class VolumeDosSolidos {

    public VolumeDosSolidos() {
    }
    
     public  double vCubo(double lado)
   {
       return lado*lado*lado;
    }
   
   public  double vEsfera(double raio)
   {
       return (4*Math.pow(Math.PI,2)*raio*raio*raio)/3;
    }
   
   public  double vCilindro(double areabase,double altura)
   {
     return(areabase*altura);
    }
   public  double vCone(double areabase,double altura)
   {
     return(areabase*altura)/3;
    } 
   
   public  double vParalelepipedo(double base,double altura,double comprimento)
   {
     return(base*altura*comprimento);
    } 
    
   public  double vPiramide(double areabase,double altura)
   {
     return(areabase*altura)/3;
    }
   //BASES DA PIRAMIDE
   
   public static double bTriangulo(double base,double altura)
   {
     return(base*altura)/2;
    }
   
   public  double bQuadrangular(double comprimento,double largura)
   {
     return(comprimento*largura);
    }
  
    public  double b(double comprimento,double largura)
   {
     return(comprimento*largura);
   }
}
