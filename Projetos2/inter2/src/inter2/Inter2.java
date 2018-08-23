/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter2;

/**
 *
 * @author maivo
 */
public class Inter2 {


public static int[] inter(int [] v1,int [] v2){
    int tamanho;
// porque o array final nao tera mais elementos que o menor array em comparacao
if(v1.length > v2.length)
tamanho = v2.length;
else
tamanho = v1.length;

int []finalarray = new int[tamanho];
int final_pos = 0;

for( int i=0; i<v1.length; ++i ){
for( int j=0; j<v2.length; ++j ){
if( v2[j]==v1 ) {

// vai percorrer o array final ( com os valores repetidos) ate chegar a posição de escrita actual, ou até encontrar um valor ja existente
for(int k=0; k<finalpos && finalarray[k]!=v1;k++);

// guarda o valor se ainda não existir, ou então faz break e passa a proxima comparacao
if(k==final_pos)
finalarray[final_pos++]=v1;
else
break;
}
}
}
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
