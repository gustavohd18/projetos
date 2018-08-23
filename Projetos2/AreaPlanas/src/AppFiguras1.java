
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
import java.util.*;
public class AppFiguras1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("-------");
        AreaPlana calculo1;
        calculo1 = new AreaPlana();
        VolumeDosSolidos calculo2;
        calculo2 = new VolumeDosSolidos();
        
        AreaLaterais calculo3;// crio uma variavel de objeto
        calculo3= new AreaLaterais();//instancio um objeto da classe AreasLateraisSolido 
        
        //  menu principal**** exemplo de possibilidade
	
		int opcao = 0;
		do {
			System.out.println("\n\n### Escolha de calculos que deseja fazer ###");
			System.out.println("\n                  =========================");
			System.out.println("                  |   1 - area quadrado    |");
			System.out.println("                  |   2 - volume esfera    |");
			System.out.println("                  |   3 - lateral cilindro |");
			System.out.println("                  |   0 - sair             |");
			System.out.println("                  =========================\n");
			opcao = teclado.nextInt();
			

			switch (opcao) {
			case 1:
				{ System.out.println ("\n Digite medida do lado do quadrado");
				 double lado=teclado.nextDouble();
				 System.out.println ("\n A medida  da area eh igual a= "+ calculo1.areaQuadrado(lado));
								};break;
			case 2:
				{ System.out.println ("\n Digite medida do raio da esfera");
				 double raio=teclado.nextDouble();
				 System.out.println ("\n A medida  do volume da esfera eh igual a= "+ calculo2.vEsfera(raio));
								};break;
                       
			case 3:
				{ System.out.println ("\n Digite medida do raio da base do cilindro");
				 double raio=teclado.nextDouble();
				 System.out.println ("\n Digite medida da altura do cilindro");
				 double altura=teclado.nextDouble();
                                 System.out.println ("\n Digite medida da base do cilindro");
				 double base=teclado.nextDouble();
				 System.out.println ("\n A medida  da area lateral do cilindro  eh igual a= "+ calculo3.aLcilindro(raio, altura,base));
								};break;
			case 0:
			     System.out.println("Tchau!");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}
}
        
        

