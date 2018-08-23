/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 17204295
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		CaixaPostal caixa = new CaixaPostal();
		caixa.CarregaEmails();
		EndEmail remetente = new EndEmail("gustavo.hernandez","acad.pucrs.br");
		EndEmail destinatario = new EndEmail("giulia.borba","acad.pucrs.br");
		MsgEmail mensagem1 = new MsgEmail(remetente, destinatario,"Aula de Java","0i tudo bem?!");
		MsgEmail mensagem2 = new MsgEmail(remetente, destinatario,"Aula de Java","0i!");
		caixa.acrescentaEmail(mensagem1);
		caixa.acrescentaEmail(mensagem2);
		caixa.salvaMsg();
		
    }
    
}
