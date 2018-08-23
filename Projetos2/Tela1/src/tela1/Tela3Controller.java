/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela1;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author maivo
 */
public class Tela3Controller implements Initializable {

    @FXML
    private Label lblD;
    @FXML
    private Button btnClique;
    @FXML
    private Label n1;
    @FXML
    private Label n2;
    @FXML
    private Label n4;
    @FXML
    private Label n5;
    @FXML
    private Label n6;
    @FXML
    private Label n7;
    @FXML
    private Label n8;
    @FXML
    private Label n10;
    @FXML
    private Label n11;
    @FXML
    private Label n12;
    @FXML
    private Label n9;
    @FXML
    private Label n3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
     
        
    }    

   



    @FXML
    private void clique(ActionEvent event) throws IOException {
             Teste t = new Teste();
        List<String> lista5 = new ArrayList<>();
        
            lista5 = t.CarregaCaixa();
        

           n1.setText(lista5.get(1));
           n2.setText(lista5.get(2));
           n3.setText(lista5.get(3));
           n4.setText(lista5.get(4));
           n5.setText(lista5.get(5));
           n6.setText(lista5.get(6));
           n7.setText(lista5.get(7));
           n8.setText(lista5.get(8));
           n9.setText(lista5.get(9));
           n10.setText(lista5.get(10));
           n11.setText(lista5.get(11));
           n12.setText(lista5.get(12));
       
    
    
}
}