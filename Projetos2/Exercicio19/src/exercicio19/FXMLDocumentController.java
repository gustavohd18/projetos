/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio19;

import static java.lang.Math.random;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
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
    private Label txtEscolhido;

    @FXML
    private TextField txtN1;

    @FXML
    private Label label;

    @FXML
    private Label txtOrdem;

    @FXML
    private TextField txtN2;

    @FXML
    private TextField txtN3;
    @FXML
    private Label txtn;

   @FXML
    private Label txtn11;


    
    @FXML
    private void clicou(ActionEvent event) {
        String n1 = txtN1.getText();
        String n2 = txtN2.getText();
        String n3 = txtN3.getText();
        List lista = new ArrayList();
        lista.add(n1);
        lista.add(n2);
        lista.add(n3);
        Random gerador = new Random();
        Collections.shuffle(lista);
        int x = gerador.nextInt(4);
        if (x == 1){
            txtEscolhido.setText(n1);
            txtOrdem.setText(n1);
            txtn.setText(n2);
            txtn11.setText(n3);
        }else if (x == 2){
            txtEscolhido.setText(n2);
            txtOrdem.setText(n2);
            txtn.setText(n3);
            txtn11.setText(n1);
        }else if (x == 3 ){
            txtEscolhido.setText(n3);
            txtOrdem.setText(n3);
            txtn.setText(n1);
            txtn11.setText(n2);
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
