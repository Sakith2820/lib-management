package com.example.libmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

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
        Parent root = FXMLLoader.load(getClass().getResource("subject.fxml"));
        primaryStage.setTitle("IIt library management system login");
        primaryStage.setScene(new Scene (root));
        primaryStage.show();
    }

    @FXML
    void slide1(MouseEvent event) {

    }
    @FXML
    private ImageView libr1;

    @FXML
    private ImageView student1;

    @FXML
    void libriyan(MouseEvent event) throws IOException {
        Stage stage = (Stage) libr1.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("LOGINlIB.fxml"));
        primaryStage.setTitle("IIt library management system login");
        primaryStage.setScene(new Scene (root));
        primaryStage.show();
    }

    @FXML
    void student(MouseEvent event) throws IOException {
        Stage stage = (Stage)student1.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("IIt library management system login");
        primaryStage.setScene(new Scene (root));
        primaryStage.show();
    }

    @FXML
    private TextField Uname1;

    @FXML
    private Button login1;

    @FXML
    private PasswordField passWord1;

    @FXML
    private Button sign12;

    @FXML
    private Label text2;

    @FXML
    void login8(ActionEvent event) throws IOException {
        Stage stage = (Stage) login.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("subject.fxml"));
        primaryStage.setTitle("IIt library management system sign in");
        primaryStage.setScene(new Scene (root));
        primaryStage.show();
    }

    @FXML
    void sign8(ActionEvent event) {
        Alert alert1 = new Alert ( Alert.AlertType.CONFIRMATION );
        alert1.setContentText ( "Already send a massage to  IIT IT mananagemant" );
        Optional<ButtonType> result1 = alert1.showAndWait ();
        ButtonType button = result1.orElse ( ButtonType.CANCEL );
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


}

