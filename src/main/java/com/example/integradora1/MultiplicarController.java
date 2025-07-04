package com.example.integradora1;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MultiplicarController {
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private Label lblResultado;
    @FXML
    private Button btnMultiplicar;

    @FXML
    protected void multiplicar() {
        this.btnMultiplicar.setOnAction((e) -> {
            Double numero1 = Double.parseDouble(this.txt1.getText());
            Double numero2 = Double.parseDouble(this.txt2.getText());
            Double resultado = numero1 * numero2;
            this.lblResultado.setText("El resultado es: " + resultado);
        });
    }

    @FXML
    protected void irMenu(ActionEvent event) throws IOException {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = Loader.load();
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,400,400));
        stage.setTitle("Menú");
        stage.show();
    }
}

