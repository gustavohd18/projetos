/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: maivo
 *
 * Created on 28 de Maio de 2018, 14:08
 */

#include <cstdlib>
#include<stdio.h>


/*
 * 
 */
int main(int argc, char** argv) {

    char nome[50];
 
    printf("Digite seu nome: ");
    scanf("%s",nome);
 
    printf("bem vindo ao sitema %s", nome);
    return 0;
}

