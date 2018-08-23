/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanburguer;

import java.util.Scanner;

/**
 *
 * @author maivo
 */
public class Hanburguer {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][1];
        int[][] matriz2 = new int[4][1];
        int[][] matriz3 = new int[4][1];
        int quantidade2 = 0;
        System.out.println("em qual filial vc esta:");
        int filial = teclado.nextInt();
        if (filial == 1) {
            System.out.println("vc deseja realizar o pedido:[1]sim ou [2]nao");
            int inicio = teclado.nextInt();
            while (inicio == 1) {

                System.out.println("digite qual lanche vc quer vender:[1]SandubaDeLuz = R$ 15,00,[2]JarJar Burguer = R$ 28,00 [3]Skywalker Burguer = R$ 30,00[4]Bauru-Yoda = R$ 25,00 ");
                int opcao = teclado.nextInt();
                if (opcao == 1) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz[0][0] = quantidade;
                    if (quantidade2 >= 4) {

                        System.out.print("limite de venda atingindo vc vendeu" + quantidade2);
                        inicio = 2;
                    }
                    quantidade2 += quantidade;

                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio = teclado.nextInt();
                }
                if (opcao == 2) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz[1][0] = quantidade;
                    quantidade2 += quantidade;
                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio = teclado.nextInt();
                }
                if (opcao == 3) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz[2][0] = quantidade;
                    quantidade2 += quantidade;
                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio = teclado.nextInt();
                }
                if (opcao == 4) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz[3][0] = quantidade;
                    quantidade2 += quantidade;
                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio = teclado.nextInt();
                }
                if (quantidade2 >= 12) {
                    System.out.println("tudo preenchido");
                    inicio = 2;
                }

            }
        } else if (filial == 2) {
            System.out.println("vc deseja realizar o pedido:[1]sim ou [2]nao");
            int inicio2 = teclado.nextInt();
            while (inicio2 == 1) {

                System.out.println("digite qual lanche vc quer vender:[1]SandubaDeLuz = R$ 15,00,[2]JarJar Burguer = R$ 28,00 [3]Skywalker Burguer = R$ 30,00[4]Bauru-Yoda = R$ 25,00 ");
                int opcao = teclado.nextInt();
                if (opcao == 1) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz2[0][0] = quantidade;
                    if (quantidade2 >= 4) {

                        System.out.print("limite de venda atingindo vc vendeu" + quantidade2);
                        inicio2 = 2;
                    }
                    quantidade2 += quantidade;

                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio2 = teclado.nextInt();
                }
                if (opcao == 2) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz2[1][0] = quantidade;
                    quantidade2 += quantidade;
                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio2 = teclado.nextInt();
                }
                if (opcao == 3) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz2[2][0] = quantidade;
                    quantidade2 += quantidade;
                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio2 = teclado.nextInt();
                }
                if (opcao == 4) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz2[3][0] = quantidade;
                    quantidade2 += quantidade;
                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio2 = teclado.nextInt();
                }
                if (quantidade2 >= 12) {
                    System.out.println("tudo preenchido");
                    inicio2 = 2;
                }
            }

        } else if (filial == 3) {
            System.out.println("vc deseja realizar o pedido:[1]sim ou [2]nao");
            int inicio3 = teclado.nextInt();
            while (inicio3 == 1) {

                System.out.println("digite qual lanche vc quer vender:[1]SandubaDeLuz = R$ 15,00,[2]JarJar Burguer = R$ 28,00 [3]Skywalker Burguer = R$ 30,00[4]Bauru-Yoda = R$ 25,00 ");
                int opcao = teclado.nextInt();
                if (opcao == 1) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz3[0][0] = quantidade;
                    if (quantidade2 >= 4) {

                        System.out.print("limite de venda atingindo vc vendeu" + quantidade2);
                        inicio3 = 2;
                    }
                    quantidade2 += quantidade;

                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio3 = teclado.nextInt();
                }
                if (opcao == 2) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz2[1][0] = quantidade;
                    quantidade2 += quantidade;
                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio3 = teclado.nextInt();
                }
                if (opcao == 3) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz3[2][0] = quantidade;
                    quantidade2 += quantidade;
                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio3 = teclado.nextInt();
                }
                if (opcao == 4) {
                    System.out.println("digite a quantidade do lanche vc quer");
                    int quantidade = teclado.nextInt();
                    matriz2[3][0] = quantidade;
                    quantidade2 += quantidade;
                    System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                    inicio3 = teclado.nextInt();
                }
                if (quantidade2 >= 12) {
                    System.out.println("tudo preenchido");
                    inicio3 = 2;
                }
            }

        }
        System.out.println("deseja realizar a venda em outra filial[1]sim [2]nao");
        int voltar = teclado.nextInt();
        while(voltar == 1) {
            System.out.println("em qual filial vc esta:");
             filial = teclado.nextInt();
            if (filial == 1) {
                System.out.println("vc deseja realizar o pedido:[1]sim ou [2]nao");
                int inicio = teclado.nextInt();
                while (inicio == 1) {

                    System.out.println("digite qual lanche vc quer vender:[1]SandubaDeLuz = R$ 15,00,[2]JarJar Burguer = R$ 28,00 [3]Skywalker Burguer = R$ 30,00[4]Bauru-Yoda = R$ 25,00 ");
                    int opcao = teclado.nextInt();
                    if (opcao == 1) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz[0][0] = quantidade;
                        if (quantidade2 >= 4) {

                            System.out.print("limite de venda atingindo vc vendeu" + quantidade2);
                            inicio = 2;
                        }
                        quantidade2 += quantidade;

                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio = teclado.nextInt();
                    }
                    if (opcao == 2) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz[1][0] = quantidade;
                        quantidade2 += quantidade;
                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio = teclado.nextInt();
                    }
                    if (opcao == 3) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz[2][0] = quantidade;
                        quantidade2 += quantidade;
                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio = teclado.nextInt();
                    }
                    if (opcao == 4) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz[3][0] = quantidade;
                        quantidade2 += quantidade;
                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio = teclado.nextInt();
                    }
                    if (quantidade2 >= 12) {
                        System.out.println("tudo preenchido");
                        inicio = 2;
                    }

                }
            } else if (filial == 2) {
                System.out.println("vc deseja realizar o pedido:[1]sim ou [2]nao");
                int inicio2 = teclado.nextInt();
                while (inicio2 == 1) {

                    System.out.println("digite qual lanche vc quer vender:[1]SandubaDeLuz = R$ 15,00,[2]JarJar Burguer = R$ 28,00 [3]Skywalker Burguer = R$ 30,00[4]Bauru-Yoda = R$ 25,00 ");
                    int opcao = teclado.nextInt();
                    if (opcao == 1) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz2[0][0] = quantidade;
                        if (quantidade2 >= 4) {

                            System.out.print("limite de venda atingindo vc vendeu" + quantidade2);
                            inicio2 = 2;
                        }
                        quantidade2 += quantidade;

                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio2 = teclado.nextInt();
                    }
                    if (opcao == 2) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz2[1][0] = quantidade;
                        quantidade2 += quantidade;
                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio2 = teclado.nextInt();
                    }
                    if (opcao == 3) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz2[2][0] = quantidade;
                        quantidade2 += quantidade;
                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio2 = teclado.nextInt();
                    }
                    if (opcao == 4) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz2[3][0] = quantidade;
                        quantidade2 += quantidade;
                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio2 = teclado.nextInt();
                    }
                    if (quantidade2 >= 12) {
                        System.out.println("tudo preenchido");
                        inicio2 = 2;
                    }
                }

            } else if (filial == 3) {
                System.out.println("vc deseja realizar o pedido:[1]sim ou [2]nao");
                int inicio3 = teclado.nextInt();
                while (inicio3 == 1) {

                    System.out.println("digite qual lanche vc quer vender:[1]SandubaDeLuz = R$ 15,00,[2]JarJar Burguer = R$ 28,00 [3]Skywalker Burguer = R$ 30,00[4]Bauru-Yoda = R$ 25,00 ");
                    int opcao = teclado.nextInt();
                    if (opcao == 1) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz3[0][0] = quantidade;
                        if (quantidade2 >= 4) {

                            System.out.print("limite de venda atingindo vc vendeu" + quantidade2);
                            inicio3 = 2;
                        }
                        quantidade2 += quantidade;

                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio3 = teclado.nextInt();
                    }
                    if (opcao == 2) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz2[1][0] = quantidade;
                        quantidade2 += quantidade;
                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio3 = teclado.nextInt();
                    }
                    if (opcao == 3) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz3[2][0] = quantidade;
                        quantidade2 += quantidade;
                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio3 = teclado.nextInt();
                    }
                    if (opcao == 4) {
                        System.out.println("digite a quantidade do lanche vc quer");
                        int quantidade = teclado.nextInt();
                        matriz2[3][0] = quantidade;
                        quantidade2 += quantidade;
                        System.out.println("produto registrado deseja mais outro produto[1]sim [2]nao");
                        inicio3 = teclado.nextInt();
                    }
                    if (quantidade2 >= 12) {
                        System.out.println("tudo preenchido");
                        inicio3 = 2;
                    }
                }

            }
            System.out.println("deseja outra filial [1]sim [2] nao");
            voltar = teclado.nextInt();
        }

        double valor1 = matriz[0][0] * 15;
        double valor2 = matriz[1][0] * 28;
        double valor3 = matriz[2][0] * 30;
        double valor4 = matriz[3][0] * 25;
        double valor11 = matriz2[0][0] * 15;
        double valor21 = matriz2[1][0] * 28;
        double valor31 = matriz2[2][0] * 30;
        double valor41 = matriz2[3][0] * 25;
        double valor111 = matriz3[0][0] * 15;
        double valor211 = matriz3[1][0] * 28;
        double valor311 = matriz3[2][0] * 30;
        double valor411 = matriz3[3][0] * 25;
        double total = valor1 + valor2 + valor3 + valor4 + valor11 + valor21 + valor31 + valor41 + valor111 + valor211 + valor311 + valor411;
        System.out.println("na matriz");
        System.out.println("o valor de vendas do lanche 1 e " + valor1);
        System.out.println("o valor de vendas do lanche 2 e " + valor2);
        System.out.println("o valor de vendas do lanche 3 e " + valor3);
        System.out.println("o valor de vendas do lanche 4 e " + valor4);
        System.out.println("---------");
        System.out.println("filial 2");
        System.out.println("o valor de vendas do lanche 1 e " + valor11);
        System.out.println("o valor de vendas do lanche 2 e " + valor21);
        System.out.println("o valor de vendas do lanche 3 e " + valor31);
        System.out.println("o valor de vendas do lanche 4 e " + valor41);
        System.out.println("---------");
        System.out.println("filial 3");
        System.out.println("o valor de vendas do lanche 1 e " + valor111);
        System.out.println("o valor de vendas do lanche 2 e " + valor211);
        System.out.println("o valor de vendas do lanche 3 e " + valor311);
        System.out.println("o valor de vendas do lanche 4 e " + valor411);
        System.out.println("---------");
        System.out.println("total de vendas");
        System.out.println("o valor total de vendas de todas as filias e  " + total);

    }
    
}
