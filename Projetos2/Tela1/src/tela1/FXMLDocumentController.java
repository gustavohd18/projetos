/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author maivo
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Label label;
    
    @FXML
    private Button Button;
    @FXML
    private Button btnC;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Button.setOnAction(e -> {
            try {
                trocaTela();
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
                btnC.setOnAction(e -> {
            try {
                trocaTela2();
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    public void trocaTela() throws IOException{
        FXMLLoader variavel = new FXMLLoader();
            Stage tela = (Stage) Button.getScene().getWindow();
            Parent root = variavel.load(getClass().getResourceAsStream("Tela2.fxml"));
            tela.setScene(new Scene(root));
            
            

            
        }
        public void trocaTela2() throws IOException{
       
            FXMLLoader variavel2 = new FXMLLoader();
            Stage tela3 = (Stage) btnC.getScene().getWindow();
            Parent root2 = variavel2.load(getClass().getResourceAsStream("Tela3.fxml"));
            tela3.setScene(new Scene(root2));
        }


    
    
}
