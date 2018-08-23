package exe3;
/**
 *
 * @author Gustavo Duarte, Giulia Borba
 */
// Classe que tem como objetivo pegar o id e Dominio de um Email com seus métodos get e set e tooString
public class EndEmail {
    private String id;
    private String dominio;


    public EndEmail(String i,String d){
        id = i;
        dominio = d;
        
    }
    public String getId() {
        return id;
    }

    
    public String getDominio() {
        return dominio;
    }

    @Override
    public String toString() {
        return "EndEmail{" + "id=" + id + ", dominio=" + dominio + '}';
    }
    
    
}
