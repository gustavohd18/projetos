/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasda;

/**
 *
 * @author maivo
 */
public class Dasda {

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

}
