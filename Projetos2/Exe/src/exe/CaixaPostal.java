/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.PrintWriter;
/**
 *
 * @author 17204295
 */
public class CaixaPostal {
    private static final int MAXPROD = 1000;
	private MsgEmail[] msg;
	private int cont;
    private MsgEmail[] caixaMensagem;
	private int cont2;
    private static final String fName = "email.txt";
      public CaixaPostal(){
        
	    caixaMensagem = new MsgEmail[1000];
		cont2 = 0;
    }
    public void CarregaEmails(){
		 msg = new MsgEmail[MAXPROD];
		   int cont = 0;
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nameComplete = currDir+"\\"+fName;
        System.out.println(nameComplete);
        Path path = Paths.get(nameComplete);
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, Charset.defaultCharset()))){
           sc.useDelimiter("[;\n]"); // separadores: ; e nova linha
		   String id1;
		   String dom1;
		   String id2;
		   String dom2;
		   String texto;
           String assunto;
           
           while (sc.hasNextLine()){
               id1 = sc.next();
               dom1 = sc.next();
               id2 = sc.next();
               dom2 = sc.next();
			   assunto = sc.next();
			   texto = sc.next();
               EndEmail rem = new EndEmail(id1,dom1);
                EndEmail des = new EndEmail(id2,dom2);
                MsgEmail m = new MsgEmail(rem,des,texto,assunto);
               msg[cont] = m;
               cont++;
           }
        }catch (IOException x){
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
    public void acrescentaEmail(MsgEmail mensagem){
		MsgEmail p = mensagem;
		caixaMensagem[cont2] = p;
		cont2 += 1;
    }
	
	public MsgEmail getMsg(int num) {
		MsgEmail aux = msg[num];
		return aux;
	}
	
	public MsgEmail removeMsg(int num) {
		MsgEmail removida = msg[num];
		msg[num] = null;
		return removida;
	}
	
	public int qtdadeMsgs() {
		int quantidade = cont;
		return quantidade;
	}
	
	public int qtdadeMsgsDest(String destinatario) {
		String dest = destinatario;
		int quantidade2 = 0;
		for (int i = 0;i < cont - 1;i++) {
			if (dest.equals(msg[i].getDestinatario())){
			quantidade2 += 1;
			}
		}
		return quantidade2;
	}
	
	public void salvaMsg(){
	String currDir = Paths.get("").toAbsolutePath().toString();
	String nameComplete = currDir+"\\"+fName;
	System.out.println(nameComplete);
	Path path = Paths.get(nameComplete);
	// defaultCharset retorna a codificação padrão de textos (usualmente UTF-8)
	try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, Charset.defaultCharset()))){
	  for(int i=0;i<caixaMensagem.length;i++){
			EndEmail remetende = caixaMensagem[i].getRemetente();
			EndEmail destinatario = caixaMensagem[i].getDestinatario();
			String linha = remetende.getId()+";"+
						   remetende.getDominio()+";"+
						   destinatario.getId()+";"+
						   destinatario.getDominio()+";"+
						   caixaMensagem[i].getAssunto()+";"+
						   caixaMensagem[i].getTexto()+";";
						   
			writer.println(linha);
		}
	}catch (IOException x){
	  System.err.format("Erro de E/S: %s%n", x);
  }
}

}



    

    

