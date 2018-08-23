
package intesecao;


public class Intesecao {

    
  public static int[] inter(int [] vet,int [] vet2){ 
 
int[] intersec1 = new  int[vet.length];

for (int i = 0; i < vet.length;i++){
for (int j = 0; j < vet2.length;j++){
        
if(vet[i]==vet2[j]){
 
        
intersec1[i] = vet[i];
}
}
}


return intersec1;
}


  public static int[] uni(int [] vet,int [] vet2){
int[] uniao = new  int[vet.length+vet2.length];
int i=0, j=0;
for (i = 0; i < vet.length;i++){
uniao[i] = vet[i];
}
for (j = i; j < (vet2.length*2);j++){
uniao[j] = vet2[i-1];
i--;
}
int[] uni2 = new  int[vet.length+vet2.length];

  int[ ] unico = new int[ uniao.length ];
        int quantidade = 0;
        for( int p = 0 ; p < uniao.length ; p++ ) {
            boolean existe = false;
            for( int k = 0 ; k < quantidade ; k++ ) {
                if( unico[ k ] == uniao[ p ] ) {
                    existe = true;
                    break;
                }
            }
            if( !existe ) {
                unico[ quantidade++ ] = uniao[ p ];
            }
        }
return unico;
} 
  

    public static void main(String[] args) {
        // TODO code application logic here
        int[] lista= new int[3];
        int[] lista2 = new int[3];
         lista [0] = 100;
         lista [1] = 110;
         lista [2] = 120;
        
         
         
         
         lista2 [0] = 110;
         lista2 [1] = 100;
         lista2 [2] = 130;
         
       
       
         
         int[] dw = uni(lista,lista2);
         for(int i = 0;i<dw.length;i++){
             System.out.println(dw[i]);
         }
   

         
        
    }
    
}

    

