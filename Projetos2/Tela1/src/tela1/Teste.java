/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author maivo
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.PrintWriter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius
 */
public class Teste {
    private static final String fName = "email.txt";
    public List<String> criarLista(List<String> nomes, int semanas){
        Calendar calendario = Calendar.getInstance();
        Calendar aux = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        Date data = calendario.getTime();
        
        if(data.getDay() > 1){
            calendario.add(Calendar.DAY_OF_MONTH, -(data.getDay()-1));
        }else if(data.getDay() < 1){
            calendario.add(Calendar.DAY_OF_MONTH, 1);
        }
        
        data = aux.getTime();
        
        if(data.getDay() < 3){
            aux.add(Calendar.DAY_OF_MONTH, data.getDay() + (3 - data.getDay()));
        }else if(data.getDay() > 3){
            aux.add(Calendar.DAY_OF_MONTH, -(data.getDay()-3));
        }
        
        List<String> novaLista = embaralhaLista(nomes);
        List<String> conograma = new LinkedList<>();
        
        int posicao = 0;
        int length = novaLista.size();
        
        while(semanas > 0){
            StringBuilder string = new StringBuilder();
            
            string.append(format.format(calendario.getTime())).append("$");
            string.append(format.format(aux.getTime())).append("$");
            
            if(posicao == (length-1)){
                posicao = 0;
                string.append(novaLista.get(posicao)).append("$").append(novaLista.get(length-1));
            }else{
                string.append(novaLista.get(posicao)).append("$").append(novaLista.get(posicao+1));
            }
            
            conograma.add(string.toString());
            
            calendario.add(Calendar.DAY_OF_MONTH, 7);
            aux.add(Calendar.DAY_OF_MONTH, 7);
            posicao++;
            semanas--;
        }
        
        return conograma;
    }
    //Requer lista não vázia
    public List<String> embaralhaLista(List<String> lista){
        Random r = new Random();
        List<String> novaLista = new ArrayList<>();
        int aux;
        
        do{
            aux = r.nextInt(lista.size());
            novaLista.add(lista.remove(aux));
        }while(lista.size() > 0);
        
        return novaLista;
    }
    
    public List<String> CarregaCaixa() throws IOException{
         List<String> lista4 = new ArrayList<>();// cria um array que recebe somente as mensagens do arquivo recebido como parametro.
		 
		 
        String currDir = Paths.get("").toAbsolutePath().toString()+"/";
        String nameComplete = currDir+fName;
        System.out.println(nameComplete);
        Path path = Paths.get(nameComplete);
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, Charset.defaultCharset()))){
           sc.useDelimiter("[;]"); // separadores: ; e nova linha
		   String datai="";
		   String dataf = "";
		   String email = "";
		   String sindico = "";
		   
                   String [] linha=null ;
          
           
           while (sc.hasNext()){
              
               linha = sc.nextLine().split("$");
               datai = linha[0];
               
               
               
                 
                String m = datai;
                
                lista4.add(m);
                
                
                   
               
           }
        }
        return lista4;
    }
    
    public void gravarEmArquivo(List<String> lista){
            String currDir = Paths.get("").toAbsolutePath().toString()+"/";
	String nameComplete = currDir+fName;
	System.out.println(nameComplete);
	Path path = Paths.get(nameComplete);
	// defaultCharset retorna a codificação padrão de textos (usualmente UTF-8)
	try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, Charset.defaultCharset()))){
                for(int j = 0; j < lista.size(); j++){

			String linha = lista.get(j)+";";
						   
						   
						   
			writer.println(linha);
               
                }
           
          
   
          
          
	}catch (IOException x){
	  System.err.format("Erro de E/S: %s%n", x);
  }
}
    }
    
    
