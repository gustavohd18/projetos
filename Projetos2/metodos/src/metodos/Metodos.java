/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author maivo
 */
public class Metodos {

    public static boolean in(double x, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                return true;
            }
        }
        return false;
    }
    public static boolean in(double x, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                return true;
            }
        }
        return false;
    }
      public static double[] interInt(double[] vetor1, double[] vetor2) {
        double[] aux = new double[vetor1.length + vetor2.length];
        int pos = 0;
        for (int i = 0; i < vetor1.length; i++) {
            if (in(vetor1[i], vetor2) && in(vetor1[i], aux) == false) {
                aux[pos] = vetor1[i];
                pos++;
            }
        }
        double[] retorno = new double[pos];
        for (int i = 0; i < retorno.length; i++) {
            retorno[i] = aux[i];
        }
        return retorno;
    }
      public static double[] uniaoInt(double[] vetor1, double[] vetor2)
    {
        double[] aux = new double[vetor1.length + vetor2.length];
        int pos = 0;
        for(int i = 0; i < vetor1.length; i ++)
        {
            if(in(vetor1[i], aux) == false)
            {
                aux[pos] = vetor1[i];
                pos ++;
            }   
        }
        for(int i = 0; i < vetor2.length; i ++)
        {
            if(in(vetor2[i], aux) == false)
            {
                aux[pos] = vetor2[i];
                pos ++;
            }
        }
        double[] retorno = new double[pos];
        for(int i = 0; i < retorno.length; i ++)
        {
            retorno[i] = aux[i];
        }
        return retorno;
    }
      public static int[] uniaoInt(int[] vetor1, int[] vetor2)
    {
        int[] aux = new int[vetor1.length + vetor2.length];
        int pos = 0;
        for(int i = 0; i < vetor1.length; i ++)
        {
            if(in(vetor1[i], aux) == false)
            {
                aux[pos] = vetor1[i];
                pos ++;
            }   
        }
        for(int i = 0; i < vetor2.length; i ++)
        {
            if(in(vetor2[i], aux) == false)
            {
                aux[pos] = vetor2[i];
                pos ++;
            }
        }
        int[] retorno = new int[pos];
        for(int i = 0; i < retorno.length; i ++)
        {
            retorno[i] = aux[i];
        }
        return retorno;
    }

    public static int[] interInt(int[] vetor1, int[] vetor2) {
        int[] aux = new int[vetor1.length + vetor2.length];
        int pos = 0;
        for (int i = 0; i < vetor1.length; i++) {
            if (in(vetor1[i], vetor2) && in(vetor1[i], aux) == false) {
                aux[pos] = vetor1[i];
                pos++;
            }
        }
        int[] retorno = new int[pos];
        for (int i = 0; i < retorno.length; i++) {
            retorno[i] = aux[i];
        }
        return retorno;
    }

    public static void imprimeVetor(int[] vet) {
        int tam = vet.length;
        for (int i = 0; i < tam; i++) {
            System.out.print(vet[i] + " ");
        }
    }

    public static void imprimeVetor(double[] vet) {
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

    public static double[] ordenaVetor(double[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    double aux = vet[j];
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

    public static double retornaMaior(double[] vet) {
        double maior = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        return maior;
    }
    //retorna o menor do vetor de double

    public static double retornaMenor(double[] vet) {
        double menor = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }

    public static double retornaMenor(int[] vet) {
        int menor = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
        }
    }

    public static void imprimeMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
        }
    }

    public static int[] somaVet(int[] vet, int[] vet2) {
        int[] soma = new int[vet.length];
        for (int i = 0; i < vet.length; i++) {
            soma[i] = vet[i] + vet2[i];
        }
        return soma;
    }

    public static double[] somaVet(double[] vet, double[] vet2) {
        double[] soma = new double[vet.length];
        for (int i = 0; i < vet.length; i++) {
            soma[i] = vet[i] + vet2[i];
        }
        return soma;
    }

    public static void main(String[] args) {

    }

}
