/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio21;

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
    private TextField txtNome;
    @FXML
    private Button button;

    @FXML
    private Label txtMi;

    @FXML
    private Label label;

    @FXML
    private Label txtMa;

    @FXML
    private Label txtQua;

    @FXML
    private void clicou(ActionEvent event) {
        String nome = txtNome.getText();
        txtQua.setText(Integer.toString(nome.length()));
        txtMa.setText(nome.toUpperCase());
        txtMi.setText(nome.toLowerCase());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
