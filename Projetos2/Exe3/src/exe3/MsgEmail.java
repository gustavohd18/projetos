
/**
 *
 * @author Gustavo Duarte, Giulia Borba
 */
package exe3;
//Classe que tem como objetivo criar uma mensagem com destinatario remetende assunto e texto com métodos get set e tooString.
public class MsgEmail {
    private EndEmail remetente;
    private EndEmail destinatario ;
    private String assunto;
    private String texto;


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


    public String getAssunto() {
        return assunto;
    }


    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return "MsgEmail{" + "remetente=" + remetente + ", destinatario=" + destinatario + ", assunto=" + assunto + ", texto=" + texto + '}';
    }
    
    
}
