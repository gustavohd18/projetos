/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a222;

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
    private Label lblIdade;

    @FXML
    private TextField lblIdade1;

    @FXML
    private Label lblP1;

    @FXML
    private Button btnBotao;

    @FXML
    private TextField lblP11;

    @FXML
    private TextField lblP22;

    @FXML
    private TextField lblP33;

    @FXML
    private Label lblP2;

    @FXML
    private Label lblP3;

    @FXML
    private Label lblNome;

    @FXML
    private TextField lblNome1;

    @FXML
    private Label lblResultado;
    
    @FXML
    private TextField lblMedia;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        
        String nome = lblNome1.getText();
        String matric = lblIdade1.getText();
        Double p1 = Double.parseDouble(lblP11.getText());
        Double p2 = Double.parseDouble(lblP22.getText());
        Double p3 = Double.parseDouble(lblP33.getText());
        Double media1 = Double.parseDouble(lblMedia.getText());
        Aluno2 p11 = new Aluno2(nome,matric,p1,p2,p3,media1);
        String media2 = p11.situacaoG1();
        lblResultado.setText(media2);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
