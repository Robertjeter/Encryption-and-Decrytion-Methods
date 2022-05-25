package com.example.test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class EncryptionOptionsController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label questionText1;

    @FXML
    private Button caesar;

    @FXML
    private Button hill;

    @FXML
    private Button des;

    public void switchtoCaesar(ActionEvent event) throws IOException { //Allows users to press "Caesar" button
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Caesar.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void switchtoHill(ActionEvent event) throws IOException { //Allows users to press "Hill" button
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Hill.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchtoDES(ActionEvent event) throws IOException { //Allows users to press "DES" button
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DES.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void back(ActionEvent event) throws IOException { //Allows users to press "Back" button
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
