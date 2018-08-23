/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela1;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author maivo
 */
public class Tela2Controller implements Initializable {

    @FXML
    private TextField n1;
    @FXML
    private TextField n2;
    @FXML
    private TextField n5;
    @FXML
    private TextField n3;
    @FXML
    private TextField n6;
    @FXML
    private TextField n4;
    @FXML
    private TextField n9;
    @FXML
    private TextField n7;
    @FXML
    private TextField n10;
    @FXML
    private TextField n8;
    @FXML
    private TextField n11;
    @FXML
    private TextField n12;
    @FXML
    private TextField quantidades;
    @FXML
    private Button gera;
    @FXML
    private Label lblR;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clicou(ActionEvent event) {
        String nome1 = n1.getText();
        String nome2 = n2.getText();
        String nome3 = n3.getText();
        String nome4 = n4.getText();
        String nome5 = n5.getText();
        String nome6 = n6.getText();
        String nome7 = n7.getText();
        String nome8 = n8.getText();
        String nome9 = n9.getText();
        String nome10 = n10.getText();
        String nome11 = n11.getText();
        String nome12 = n12.getText();
        int quantidade = Integer.parseInt(quantidades.getText());
        
        Teste t = new Teste();
        List<String> lista = new ArrayList<>();
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        lista.add(nome1);
        lista.add(nome2);
        lista.add(nome3);
        lista.add(nome4);
        lista.add(nome5);
        lista.add(nome6);
        lista.add(nome7);
        lista.add(nome8);
        lista.add(nome9);
        lista.add(nome10);
        lista.add(nome11);
        lista.add(nome12);
        lista1 = t.criarLista(lista, quantidade);
        lista2 = t.embaralhaLista(lista1);
        t.gravarEmArquivo(lista2);
        lblR.setText("Gravado com sucesso");
    }
    
}
