/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author maivo
 */
public class Biblioteca {
     public static boolean impar(int num) {
        if (num % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int maiordeTres(int valor1, int valor2, int valor3) {
        if (valor1 > valor2 && valor1 > valor3) {
            return valor1;
        }
        if (valor2 > valor1 && valor2 > valor3) {
            return valor2;
        }
        if (valor3 > valor1 && valor3 > valor2) {
            return valor3;
        }
        return 0;
    }

    public static double maiordeTres(double valor1, double valor2, double valor3) {
        if (valor1 > valor2 && valor1 > valor3) {
            return valor1;
        }
        if (valor2 > valor1 && valor2 > valor3) {
            return valor2;
        }
        if (valor3 > valor1 && valor3 > valor2) {
            return valor3;
        }
        return 0;
    }

    public static int menordeTres(int valor1, int valor2, int valor3) {
        if (valor1 < valor2 && valor1 < valor3) {
            return valor1;
        }
        if (valor2 < valor1 && valor2 < valor3) {
            return valor2;
        }
        if (valor3 < valor1 && valor3 < valor2) {
            return valor3;
        }
        return 0;
    }

    public static double menordeTres(double valor1, double valor2, double valor3) {
        if (valor1 < valor2 && valor1 < valor3) {
            return valor1;
        }
        if (valor2 < valor1 && valor2 < valor3) {
            return valor2;
        }
        if (valor3 < valor1 && valor3 < valor2) {
            return valor3;
        }
        return 0;
    }

    public static boolean par(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numeroAmigo(int valor1, int valor2) {
        int soma1 = somaDivNumAmigo(valor1);
        int soma2 = somaDivNumAmigo(valor2);
        if (soma1 == valor2 && soma2 == valor1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numeroPerfeito(int valor) {
        int soma1 = somaDivNumAmigo(valor);
        if (soma1 == valor) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean primo(int num) {
        int contador = 0;
        int aux = 1;
        for (aux = 1; aux <= num; aux++) {
            if (num % aux == 0) {
                contador++;
            }
            if (contador > 2) {
                return false;
            }
        }
        return true;
    }

    public static int quantDivisores(int num) {
        int contador = 0;
        int aux = 1;
        for (aux = 1; aux <= num; aux++) {
            if (num % aux == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int somaDiv(int valor) {
        int soma = 0;
        int antecessor = 1;
        for (antecessor = 1; antecessor <= valor; antecessor++) {
            if (valor % antecessor == 0) {
                soma = soma + antecessor;
            }
        }
        return soma;
    }

    public static int somaDivNumAmigo(int valor) {
        int soma = 0;
        int antecessor = 1;
        for (antecessor = 1; antecessor < valor; antecessor++) {
            if (valor % antecessor == 0) {
                soma = soma + antecessor;
            }
        }
        return soma;
    }

    public static boolean numeroTriangular(int valor) {
        int i;
        for (i = 1; i < valor; i++) {
            if (i * (i + 1) * (i + 2) == valor) {
                return true;
            }
        }
        return false;
    }
  public static void imprimeVetor(int[] vet) {
        int tam = vet.length;
        for (int i = 0; i < tam; i++) {
            System.out.print(vet[i] + " ");
        }
    }

    public static int[] ordenaVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        return vet;
    }

    public static int retornaMaior(int[] vet) {
        int maior = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        return maior;
    }

    public static double retornaMariod(double[] vet) {//retorna o maior do vetor de double
        double maior = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        return maior;
    }

    public static int retornaMenor(int[] vet) {
        int menor = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }

    public static double retornaMenord(double[] vet) {//retorna o menor do vetor de double
        double menor = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }

    public static int[] somaVet(int[] vet, int[] vet2) {
        int[] soma = new int[vet.length];
        for (int i = 0; i < vet.length; i++) {
            soma[i] = vet[i] + vet2[i];
        }
        return soma;
    }

    public static double[] somaVetD(double[] vet, double[] vet2) {
        double[] soma = new double[vet.length];
        for (int i = 0; i < vet.length; i++) {
            soma[i] = vet[i] + vet2[i];
        }
        return soma;
    }

    public static int[] interseccaoVet(int[] vet, int[] vet2) {
        int[] intersec = new int[vet.length];
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (vet[i] == vet[j]) {
                    intersec[i] = vet[i];
                }
            }
        }
        return intersec;
    }

    public static double[] interseccaoVetd(double[] vet, double[] vet2) {
        double[] intersec = new double[vet.length];
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (vet[i] == vet[j]) {
                    intersec[i] = vet[i];
                }
            }
        }
        return intersec;
    }

    public static int[] uniaoVet(int[] vet, int[] vet2) {
        int[] uniao = new int[vet.length * 2];
        int i = 0, j = 0;
        for (i = 0; i < vet.length; i++) {
            uniao[i] = vet[i];
        }
        for (j = i; j < (vet2.length * 2); j++) {
            uniao[j] = vet2[i - 1];
            i--;
        }
        return uniao;
    }

    public static double[] uniaoVetd(double[] vet, double[] vet2) {
        double[] uniao = new double[vet.length * 2];
        int i = 0, j = 0;
        for (i = 0; i < vet.length; i++) {
            uniao[i] = vet[i];
        }
        for (j = i; j < (vet2.length * 2); j++) {
            uniao[j] = vet2[i - 1];
            i--;
        }
        return uniao;
    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
        }
    }

    public static int[][] ordenaMatriz(int[][] matriz) {
        int aux;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                int colu = coluna;
                for (int i = linha; i < matriz.length; i++) {
                    for (int j = colu + 1; j < matriz[i].length; j++) {
                        if (matriz[linha][coluna] > matriz[i][j]) {
                            aux = matriz[linha][coluna];
                            matriz[linha][coluna] = matriz[i][j];
                            matriz[i][j] = aux;
                        }
                    }
                    colu = -1;
                }
            }
        }
        return matriz;
    }

    public static double[][] ordenaMatrizd(double[][] matriz) {
        double aux;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                int colu = coluna;
                for (int i = linha; i < matriz.length; i++) {
                    for (int j = colu + 1; j < matriz[i].length; j++) {
                        if (matriz[linha][coluna] > matriz[i][j]) {
                            aux = matriz[linha][coluna];
                            matriz[linha][coluna] = matriz[i][j];
                            matriz[i][j] = aux;
                        }
                    }
                    colu = -1;
                }
            }
        }
        return matriz;
    }

    public static int retornaMaior(int[][] matriz) {
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public static double retornaMaiord(double[][] matriz) {
        double maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public static int retornaMenor(int[][] matriz) {
        int menor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static double retornaMenord(double[][] matriz) {
        double menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static int[][] matrizSoma(int[][] matriz1, int[][] matriz2) {
        int[][] soma = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];;
            }
        }
        return soma;
    }

    public static double[][] matrizSomad(double[][] matriz1, double[][] matriz2) {
        double[][] soma = new double[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];;
            }
        }
        return soma;
    }

    public static int[] vetorDaMat(int[][] matriz1) {
        int x = matriz1.length * matriz1[0].length;
        int cont = 0;
        int[] vet = new int[x];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                vet[cont] = matriz1[i][j];
                cont++;
            }
        }
        return vet;
    }
}
