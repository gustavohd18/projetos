


/**
 *
 * @author Gustavo Duarte, Giulia Borba
 */
package exe3;
//Main para teste das classes.
public class Exercicio {

    
    public static void main(String[] args) {
       
		CaixaPostal caixa = new CaixaPostal();// crio um objeto da classe Caixa postal.
		caixa.CarregaEmails();//Carrego todos os emails que tem no meu arquivo de texto.
		EndEmail remetente = new EndEmail("gustavo.hernandez","acad.pucrs.br");//crio um remetente da classe EndEmail com id e dominio
		EndEmail destinatario = new EndEmail("giulia.borba","acad.pucrs.br");//crio um destinatario da classe EndEmail com id e dominio
		MsgEmail mensagem1 = new MsgEmail(remetente, destinatario,"Aula de Java","0i tudo?!");//crio uma mensagem do tipo MsgEmail
		MsgEmail mensagem2 = new MsgEmail(remetente, destinatario,"Aula de Java","0i!");//crio uma mensagem do tipo MsgEmail
                MsgEmail mensagem3 = new MsgEmail(remetente, destinatario,"Aula de Java","0i Giula!");//crio uma mensagem do tipo MsgEmail
                MsgEmail mensagem4 = new MsgEmail(remetente, destinatario,"Aula de Java","0i Giula!");//crio uma mensagem do tipo MsgEmail
		caixa.acrescentaEmail(mensagem1);//Acrescento a mensagem a um vetor chamado caixa de mensagem. 
		caixa.acrescentaEmail(mensagem2);//Acrescento a mensagem a um vetor chamado caixa de mensagem.
                caixa.acrescentaEmail(mensagem3);//Acrescento a mensagem a um vetor chamado caixa de mensagem.
                caixa.acrescentaEmail(mensagem4);//Acrescento a mensagem a um vetor chamado caixa de mensagem.
               // System.out.println("A mensagem encontrada foi "+caixa.getMsg(0));//metodo para pegar uma mensagem com seu conteudo na caixa postal.

                 // System.out.println("a quantidade de mensagem com o destinatario informado foi "+caixa.qtdadeMsgsDest("giulia.borba"+"acad.pucrs.br"));//metodo para pegar a quantidade total de mensagem que tem aquele destinatario.
                //System.out.println("A quantidade de mensagens da caixa de mensagem é "+caixa.qtdadeMsgs());//metodo para pegar a quantidade total de emails.
                caixa.salvaMsg();
               
              
		
		
    }
    
}
