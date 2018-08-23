/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiodagirra25;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Desafiodagirra25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("=====bem vindo ao contrutor de armas====");
        System.out.println("informe o nome do 1 dragao: ");
        String nome  = teclado.nextLine();
        System.out.println("informe a idade do 1 dragao");
        int idade = teclado.nextInt();
        System.out.println("informe a altura do 1 dragao");
        double altura = teclado.nextDouble();
        System.out.println("informe o nome do 2 dragao: ");
        String nome2  = teclado.nextLine();
        System.out.println("informe a idade do 2 dragao");
        int idade2 = teclado.nextInt();
        System.out.println("informe a altura do 2 dragao");
        double altura2 = teclado.nextDouble();
        System.out.println("informe o nome do 3 dragao: ");
        String nome3  = teclado.nextLine();
        System.out.println("informe a idade do 3 dragao");
        int idade3 = teclado.nextInt();
        System.out.println("informe a altura do 3 dragao");
        double altura3 = teclado.nextDouble();
        System.out.println("informe a quantidade de espadas e escudo que vc deseja fazer");
        int quantidade = teclado.nextInt();
        System.out.println("diga a quantidade de combustivel vc tem:");
        int combustivel = teclado.nextInt();
        double alcance1 = idade * altura;
        double alcance2 = idade2 * altura2;
        double alcance3 = idade3 * altura3;
        double quantidadedeIntensidade = 1000*quantidade;
        double intensidade1 = alcance1*combustivel;
        double intensidade2 = alcance2*combustivel;
        double intensidade3 = alcance3*combustivel;
        int dia = 1;
        int qua = 0;
        int dia2 = 1;
        int  qua2 = 0;
        int dia3 = 1;
        int  qua3 = 0;
        double aux1 = intensidade1;
        while(aux1<quantidadedeIntensidade){
            // do primeiro dragao
            qua  = qua + 1;
            dia = dia + 1;
            aux1 ++;
        }
                System.out.println(dia);
                double aux2 = intensidade2;
        while(aux2<quantidadedeIntensidade){
            //do segundo dragao
            qua2  = qua2 + 1;
            dia2 = dia2+ 1;
            aux2 ++;
        }
               System.out.println(dia2);
   
      double aux3 = intensidade3;
        while(aux3<quantidadedeIntensidade){
            // do terceiro dragao
            qua3  = qua3 + 1;
            dia3 = dia3+ 1;
            aux3 ++;
        }
                System.out.println(dia3);
    
    if (dia < dia2 && dia < dia3){
        //diz que o melhor e o primeiro pelo menor tempo.
            System.out.println(dia);
}
    if (dia2< dia && dia2 <dia3){
        //diz que e o melhor o segundo dragao pelo tempo.
            System.out.println(dia2);
}
    if (dia3 < dia2 && dia3 < dia3){
        // diz que e o melhor o terceiro dragao.
        // falta por o nome dos dragaos em cada um delees.
            System.out.println(dia3);
}
    }
}
