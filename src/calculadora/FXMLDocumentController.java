/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button butaoC;
    @FXML
    private TextField textFieldNumero;
    @FXML
    private Text textD;
    @FXML
    private Text textT;
    @FXML
    private Text textQ;
    @FXML
    private Text textC;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calcular(ActionEvent event) {
        String a = textFieldNumero.getText();
        double b = Double.parseDouble(a);
        
        double dobro = b * 2;
        textD.setText(Double.toString(dobro));
        
        double triplo = b * 3;
        textT.setText(Double.toString(triplo));
        
        double quad = Math.pow(b,2);
        textQ.setText(Double.toString(quad));
        
        double cubo = Math.pow(b,3);
        textC.setText(Double.toString(cubo));
    }
    
}
