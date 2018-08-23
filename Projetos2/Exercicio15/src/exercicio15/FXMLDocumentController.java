/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio15;

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
    private Button button;

    @FXML
    private TextField txtKm;

    @FXML
    private Label label;

    @FXML
    private TextField txtDias;
    @FXML
    private Label txtResp;

    
    @FXML
    private void clicouBotao(ActionEvent event) {
       double km = Double.parseDouble(txtKm.getText());
       int dia = Integer.parseInt(txtDias.getText());
       double preco = (60*dia)+(0.15*km);
       txtResp.setText(Double.toString(preco));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
