/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascoaaa;

import java.util.Scanner;

/**
 *
 * @author gustavo duarte e julia
 */
public class Pascoaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     double custo_total = 0;
     int fixo = 5;
     float embalagem =1.50f;
     double custo_ta = 0;
     double custo_total1 = 0;
     double custo_total2 = 0;
     Scanner teclado = new Scanner(System.in);
     System.out.println("digite o tipo de ovo: [1]chocolate[2]com casca de bombom[3]casca recheada");
     int tipo = teclado.nextInt();
     System.out.println("digite a gramagem do ovo:[1]300g[2]400g[3]500g[4]700g[5]1000g");
     int peso = teclado.nextInt();
     System.out.println("digite a categoria do personagem[0]nenhum[1]5.00[2]8.00[3]13.00[4]15.00 ");
     int personagem = teclado.nextInt();
        System.out.println("digite a categoria do brinquedo:[0]nenhum[1]3.00[2]8.00[3]10.00");
        int brinquedo = teclado.nextInt();
    if (peso == 1){
        custo_ta = 3.00;       
    }else if(peso == 2){
        custo_ta = 4.00;
    }else if(peso == 3){
        custo_ta = 4.50;
    }else if (peso == 4){
        custo_ta = 5.00;
    }else if(peso == 5){
        custo_ta =5.50;
    }
    if (tipo == 1 && peso == 1){
            custo_total = custo_total +10;

    }else if(tipo==1 && peso == 2){
            custo_total = custo_total+15;
    }else if(tipo==1 && peso== 3){
           custo_total= custo_total+20;
    }else if(tipo==1 && peso== 4){
           custo_total = custo_total +30;
    }else if (tipo == 1 && peso == 5){
          custo_total =custo_total + 45;
        
    }
    if (tipo == 2 && peso == 1){
            custo_total = custo_total + 12;

    }else if(tipo==2 && peso == 2){
            custo_total = custo_total+18;
    }else if(tipo==2 && peso== 3){
           custo_total= custo_total+23;
    }else if(tipo==2 && peso== 4){
           custo_total = custo_total +33;
    }else if (tipo == 2 && peso == 5){
          custo_total =custo_total + 48;
        
    }else if (tipo == 3 && peso == 1){
            custo_total = custo_total +15;

    }else if(tipo==3 && peso == 2){
            custo_total = custo_total+20;
    }else if(tipo==3 && peso== 3){
           custo_total= custo_total+30;
    }else if(tipo==3 && peso== 4){
           custo_total = custo_total +40;
    }else if (tipo == 3 && peso == 5){
          custo_total =custo_total + 50;   
    }if (personagem==0){
        custo_total2=0;
    }else if(personagem==1){
        custo_total2 =custo_total2 + 5;
    }else if (personagem==2){
        custo_total2 =  custo_total2+8;
        }else if (personagem==3){
        custo_total2 = custo_total2+ 13;
    }else if (personagem==4){
        custo_total2 = custo_total2+15 ;
    }
    
    if(brinquedo==0){
        custo_total1 = custo_total1 +0;
    }else if (brinquedo==1){
        custo_total1 = custo_total1 + 3;
    }else if (brinquedo==2){
        custo_total1 = custo_total1 + 8 ;
    }else if (brinquedo==3){
        custo_total1 = custo_total1 + 10;
    }      
    double total =(custo_total +custo_ta+fixo+embalagem+custo_total1+custo_total2)+(custo_total +custo_ta+fixo+embalagem+custo_total1+custo_total2)*0.18;
        System.out.println(total);
        System.out.println(custo_total1);
        System.out.println(custo_total2);
        System.out.println(custo_total);
        System.out.println(fixo);
        System.out.println(embalagem);
        System.out.println(custo_ta);
    }
}