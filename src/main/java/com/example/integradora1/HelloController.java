package com.example.integradora1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML private Label txt;

    @FXML
    protected void irSuma(ActionEvent event) throws IOException {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("Suma.fxml"));
        Parent root = Loader.load();
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,400,400));
        stage.setTitle("Suma");
        stage.show();
    }

    @FXML
    protected void irResta(ActionEvent event) throws IOException {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("Resta.fxml"));
        Parent root = Loader.load();
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,400,400));
        stage.setTitle("Resta");
        stage.show();
    }

    @FXML
    protected void irMultiplicar(ActionEvent event) throws IOException {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("multiplicar.fxml"));
        Parent root = Loader.load();
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root,400,400));
        stage.setTitle("Multiplicación");
        stage.show();
    }
}