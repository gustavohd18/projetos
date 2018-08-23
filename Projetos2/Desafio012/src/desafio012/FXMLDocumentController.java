/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio012;

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
    private TextField lblPreco;

    @FXML
    private Label label;

    @FXML
    private Button btnClique;

    @FXML
    private Label lblResultado;
    @FXML
    private void clicouBotao(ActionEvent event) {
        Double produto = Double.parseDouble(lblPreco.getText());
        double novo_preco = produto - (produto * 5 / 100);
        lblResultado.setText("o valor do produto com desconto é de "+Double.toString(novo_preco));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
