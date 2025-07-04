package com.example.integradora1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class RestaController{

    @FXML private TextField txt1;
    @FXML private TextField txt2;
    @FXML private Label lblResultado;
    @FXML private Button btnResultadoResta;
    @FXML private Button btnVolver;

    @FXML
    protected void onResultadoResta() {

        btnResultadoResta.setOnAction(event -> {
            double numero1 = Double.parseDouble(txt1.getText());
            double numero2 = Double.parseDouble(txt2.getText());
            double resultado = numero1 - numero2;
            lblResultado.setText("El resultado es: " + resultado); //hola gabriel
        });
    }

    @FXML protected void onVolver(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 400, 400));
        stage.setTitle("Resta");
        stage.show();
    }
}

