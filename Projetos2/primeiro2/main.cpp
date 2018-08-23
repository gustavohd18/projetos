/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: maivo
 *
 * Created on 12 de Agosto de 2018, 14:58
 */

#include <stdio.h>



/*
 * 
 */
int main(void) {
    int v;
      printf("deseja continuar digite 1 para sim 2 para nao: ");
    scanf("%i",v);
    while(v!=1){
     int nome;
    int n1,n2;
    float media;
    printf("Digite sua primeira nota: ");
    scanf("%i",&nome);
    printf("Digite sua nota nota: ");
    scanf("%i",&n1);
    printf("Digite sua nota nota: ");
    scanf("%i",&n2);
    media = (n1+n2+nome)/3;
    printf("sua media e %f",media);
    printf("deseja continuar digite 1 para sim 2 para nao: ");
    scanf("%i",v);

    }
        return 0;
}

