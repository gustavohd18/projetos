/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diverso;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author maivo
 */
public class FXMLDocumentController implements Initializable {
    
    


    @FXML
    private Label lblSoma;

    @FXML
    private Button btnSoma;

    @FXML
    private TextField txtN1;

    @FXML
    private TextField txtN2;

 
    @FXML
    private void clicouBotao(ActionEvent event) {
    int n1 = Integer.parseInt(txtN1.getText());
    int n2 = Integer.parseInt(txtN2.getText());
    int s = n1 + n2;
    lblSoma.setText(Integer.toString(s));
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
