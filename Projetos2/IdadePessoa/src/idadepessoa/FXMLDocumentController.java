/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadepessoa;

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
    private Label lblId;

    @FXML
    private Label lblResultado;

    @FXML
    private TextField lblNascimento;
    
    @FXML
    private void cliqueBotao(ActionEvent event) {
        int nascimento = Integer.parseInt(lblNascimento.getText());
        int idade = 2018 - nascimento;
        lblResultado.setText(Integer.toString(idade));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
