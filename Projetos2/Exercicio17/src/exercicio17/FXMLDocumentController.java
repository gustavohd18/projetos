/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio17;

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
    private TextField txtCa;

    @FXML
    private TextField txtCo;

    @FXML
    private Label label;
    @FXML
    private Label txtResp;

    
    @FXML
    private void clicou(ActionEvent event) {
        double ca = Double.parseDouble(txtCa.getText());
        double co = Double.parseDouble(txtCo.getText());
        double hip = Math.hypot(co, ca);
        txtResp.setText(Double.toString(hip));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
