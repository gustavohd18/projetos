package exe3;

/**
 *
 * @author Gustavo Duarte, Giulia Borba
 */
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
// Classe que tem como objetivo pegar todos as Mensagem e carregar, armazenar e trabalhar com o arquivo de texto. 
public class CaixaPostal {
    private static final int MAXPROD = 1000;
	private ArrayList<MsgEmail> msg;
        private MsgEmail[] msgaux;
	private int cont;
        private int index ;
        int con ;
    private MsgEmail[] caixaMensagem;// cria um vetor que recebe somente as mensagens digitadas durante a execução.
	private int cont2;
    private static final String fName = "email.txt";
      public CaixaPostal(){
            msgaux = new MsgEmail[1000];
	    caixaMensagem = new MsgEmail[1000];
		cont2 = 0;
                cont = 0;
                index = 1;
    }
      //Método que carrega os emails do arquivo.
    public void CarregaEmails(){
         msg = new ArrayList<MsgEmail>();// cria um array que recebe somente as mensagens do arquivo recebido como parametro.
		 
		 
        String currDir = Paths.get("").toAbsolutePath().toString()+"/";
        String nameComplete = currDir+fName;
        System.out.println(nameComplete);
        Path path = Paths.get(nameComplete);
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, Charset.defaultCharset()))){
           sc.useDelimiter("[;]"); // separadores: ; e nova linha
		   String id1="";
		   String dom1;
		   String id2;
		   String dom2;
		   String texto;
                   String [] linha=null ;
           String assunto;
           
           while (sc.hasNext()){
              
               linha = sc.nextLine().split(";");
               id1 = linha[0];
               dom1 = linha[1];
               id2 = linha[2];
               dom2 = linha[3];
               assunto = linha[4];
               texto = linha[5];
                 EndEmail rem = new EndEmail(id1,dom1);
                EndEmail des = new EndEmail(id2,dom2);
                MsgEmail m = new MsgEmail(rem,des,texto,assunto);
                
                msg.add(m);
                cont +=1;
                   
               
           }
            
           

            
        }catch (IOException x){
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
    //Método que adiciona a mensagem digitada durante a execução no vetor caixa de mensagem.
    public void acrescentaEmail(MsgEmail mensagem){
		MsgEmail p = mensagem;
		caixaMensagem[cont2] = p;
                
		cont2 += 1;
                
    }
	//Método que pega uma mensagem passando por parametro o numero de posição da mensagem.
	public MsgEmail getMsg(int num) {
		MsgEmail aux = msg.get(num);
		return aux;
	}
	//Método que pega uma mensagem passando por parametro o numero de posição da mensagem e remove do arquivo retornando somente a mensagem que foi apagada.
	public MsgEmail removeMsg(int num) {
		MsgEmail removida = msg.get(num);
                 msg.remove(num);
                
        
       return removida;
	}
	//Método que pega a quantidade total de email do arquivo lido.
	public int qtdadeMsgs() {
		int quantidade = cont;
                
		return quantidade;
                
	}
		//Método que pega a quantidade total de email do arquivo conforme o destinatario passado como parametro.
	public int qtdadeMsgsDest(String destinatario) {
		String dest = destinatario;
		int quantidade2 = 0;
		for (int i = 0;i < msg.size();i++) {
                    
			if (dest.equals(msg.get(i).getDestinatario().getId()+msg.get(i).getDestinatario().getDominio())){
			quantidade2 += 1;
			}
		}
		return quantidade2;
	}
		//Método que salva todas as mensagens tanto as que estao no arraylist do arquivo lido como da caixa de mensagem.
	public void salvaMsg(){
         
	String currDir = Paths.get("").toAbsolutePath().toString()+"/";
	String nameComplete = currDir+fName;
	System.out.println(nameComplete);
	Path path = Paths.get(nameComplete);
	// defaultCharset retorna a codificação padrão de textos (usualmente UTF-8)
	try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, Charset.defaultCharset()))){
                for(int j = 0; j < msg.size(); j++){
                
                    EndEmail remetende = msg.get(j).getRemetente();
			EndEmail destinatario = msg.get(j).getDestinatario();
			String linha = remetende.getId()+";"+
						   remetende.getDominio()+";"+
						   destinatario.getId()+";"+
						   destinatario.getDominio()+";"+
						   msg.get(j).getAssunto()+";"+
                                
						   msg.get(j).getTexto()+";";
						   
			writer.println(linha);
               
                }
           
                
	  for(int i=0;i<cont2;i++){
              
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



    

    

