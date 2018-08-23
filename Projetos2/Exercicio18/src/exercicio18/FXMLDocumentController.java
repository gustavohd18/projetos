/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio18;

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
    private Label txtSeno;

    @FXML
    private Label txtTan;

    @FXML
    private TextField txtAngulo;

    @FXML
    private Label txtCos;

    @FXML
    private Label label;
    
    @FXML
    private void clicou(ActionEvent event) {
        double angulo = Double.parseDouble(txtAngulo.getText());
        double seno = Math.sin(angulo);
        double cos = Math.cos(angulo);
        double tan = Math.tan(angulo);
        txtCos.setText(Double.toString(cos));
        txtSeno.setText(Double.toString(seno));
        txtTan.setText(Double.toString(tan));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
