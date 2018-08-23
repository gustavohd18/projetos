/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 17204295
 */
public class MsgEmail {
    private EndEmail remetente;
    private EndEmail destinatario ;
    private String assunto;
    private String texto;

    /**
     * @return the remetente
     */
    
    
    public MsgEmail(EndEmail remete,EndEmail destina,String assunt,String text){
		
		remetente = remete;
        destinatario = destina;
        assunto = assunt;
        texto = text;
    }
    public EndEmail getDestinatario() {
        return destinatario;
    }
    public EndEmail getRemetente() {
        return remetente;
    }

    /**
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }
    
    
}
