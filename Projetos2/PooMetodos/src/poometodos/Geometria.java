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
public class Geometria {
    public static double volume(double raio){
        double volume = 4*3.14*raio/3;
        return volume;
    }
    public static double superficie(double raio){
                double area = 4*3.14*(raio*raio);
                return area;
    }
    public static double cilindro(double area1,double raio){
        double area = area1 * raio;
        
        return area;
    }
      public static double cone(double altura,double raio){
        double area = 3.14*altura * (raio*raio)/3;
        
        return area;
    }
      public static double libras(double kg){
          double conversao = kg*2.20;
          
          return conversao;
      }
            public static double kg(double libras){
          double conversao = libras/2.20;
          
          return conversao;
      }
            public static double f(double graus){
               double f= graus * 9/5 + 32;
               return f;
            }
            public static double c(double graus){
               double f= graus- 32/1.800;
               return f;
            }
            public static double pes (double cm){
                double pes = cm * 0.032808;
                return pes;
            }
                        public static double cm (double pes){
                double cm = pes / 0.032808;
                return cm;
            }
}
