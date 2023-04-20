package com.example.libmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button shop;

    @FXML
    private AnchorPane slide;

    @FXML
    void shopnow(ActionEvent event) throws IOException {

        Stage stage = (Stage) shop.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("IIt library management system login");
        primaryStage.setScene(new Scene (root));
        primaryStage.show();
    }

    @FXML
    void slide1(MouseEvent event) {

    }

    @FXML
    private TextField Uname;

    @FXML
    private Button login;

    @FXML
    private PasswordField passWord;

    @FXML
    private Button sign;

    @FXML
    private Label text;

    @FXML
    void login(ActionEvent event) {

    }

    @FXML
    void sign(ActionEvent event) {

    }

}
