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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
    void login(ActionEvent event) throws IOException {
        Stage stage = (Stage) login.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("subject.fxml"));
        primaryStage.setTitle("IIt library management system sign in");
        primaryStage.setScene(new Scene (root));
        primaryStage.show();
    }

    @FXML
    void sign(ActionEvent event) throws IOException {
        Stage stage = (Stage) sign.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sign.fxml"));
        primaryStage.setTitle("IIt library management system sign in");
        primaryStage.setScene(new Scene (root));
        primaryStage.show();
    }



    @FXML
    private TextArea Address;

    @FXML
    private TextField Fname;

    @FXML
    private TextField Lname;

    @FXML
    private TextField cont;

    @FXML
    private Button loginnow;

    @FXML
    private PasswordField pAssword;

    @FXML
    private Button sign1;

    @FXML
    private TextField usern;

    @FXML
    void nowlogin(ActionEvent event) throws IOException {
        Stage stage = (Stage)loginnow.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Chowbay login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void wellcome1(ActionEvent event) throws IOException {
        Stage stage = (Stage)sign1.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Chowbay login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    @FXML
    private Button bs;

    @FXML
    private Button cool;

    @FXML
    private Button cs;

    @FXML
    private Button cs1;

    @FXML
    private Button cs2;

    @FXML
    private Button cs3;

    @FXML
    void bake(ActionEvent event) {

    }

    @FXML
    void cool1(ActionEvent event) {

    }

    @FXML
    void cs1(ActionEvent event) {

    }


}

