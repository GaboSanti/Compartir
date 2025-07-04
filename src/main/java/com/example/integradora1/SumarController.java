package com.example.integradora1;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;


public class SumarController{
    @FXML private TextField num1;
    @FXML private TextField num2;
    @FXML private Button btnResultado;
    @FXML private Button btnRegresar;
    @FXML private Label lblresultado;

    @FXML
    protected void onClickSumar() {
        btnResultado.setOnAction(event -> {
            double numero1 = Double.parseDouble(num1.getText());
            double numero2 = Double.parseDouble(num2.getText());
            double resultado = numero1 + numero2;
            lblresultado.setText("El resultado es: " + resultado);
        });
    }

    @FXML
    protected void irRegresarMenu(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("helo-view.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root,400,400));
            stage.setTitle("hello");
            stage.show();
    }

}

