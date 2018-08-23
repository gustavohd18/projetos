/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemarvel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
   @FXML
    private TextField lblTitulo;

    @FXML
    private Label label;

    @FXML
    private Button btnClique;

    @FXML
    private TextField lblResultado;

    @FXML
    private Label lblResposta;
    @FXML
    private void clicouBotao(ActionEvent event) {
        String titulo = lblTitulo.getText();
        String resposta = lblResultado.getText();
        PerguntaMarvel p11 = new PerguntaMarvel();
        p11.setResposta(resposta);
        p11.setTitulo(titulo);
        
        PerguntaMarvelDao p6 = new PerguntaMarvelDao();
        p6.insert(p11);
        
        String re = p6.resposta(p11);
        lblResposta.setText(re);
        
        
       
        
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
