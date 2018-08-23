/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajava009;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private TextField txtAno;

    @FXML
    private Label txtResultado;

    @FXML
    private Label label;
    
    @FXML
    private void clicou(ActionEvent event) {
        int ano = Integer.parseInt(txtAno.getText());
        int idade = 2018 - ano;
        if (idade > 18){
        txtResultado.setText("vc pode votar e pode se alistar");
        }else{
            txtResultado.setText("vc nao pode votar e nao pode se cadastrar");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
