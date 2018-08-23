/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversosgirafa;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class DiversosGirafa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe a quantidade de aulas: ");
        int aula = teclado.nextInt();
        System.out.println("informe a quantidade de aulas que o aluno assistiu: ");
        float assistido = teclado.nextFloat();
        System.out.println("informe a 1 nota:");
        float n1= teclado.nextFloat();
        System.out.println("informe a 2 nota:");
        float n2= teclado.nextFloat();
        System.out.println("informe a 3 nota:");
        float n3= teclado.nextFloat();
        float frequencia = (aula*0.75f);
        float media =(n1+n2+n3)/3;
        System.out.println(frequencia);
        System.out.println(assistido);
        if(assistido<frequencia){
            System.out.println("reprovado por frequencia");
        }else if(media>=7&& assistido >=frequencia){
            System.out.println("parabens aprovado em g1");
        }else if(media <7 && media >=4&& assistido >=frequencia){
        System.out.println("esta em g2");
        float    g2=10-media;
        System.out.println("vc precisa tirar "+g2+"para passar");
    }else if(media<4 ){
            System.out.println("reprovado diretamente por insuficiencia");
        }
    }    
}
