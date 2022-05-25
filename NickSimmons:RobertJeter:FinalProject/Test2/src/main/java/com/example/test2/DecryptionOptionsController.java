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

public class DecryptionOptionsController {
    private Stage stage;
    private Scene scene;

    @FXML
    private Label questionText1;

    @FXML
    private Button caesaDr;

    @FXML
    private Button hillD;

    @FXML
    private Button desD;

    public void switchtoCaesarD(ActionEvent event) throws IOException { //Allows users to press "Caesar" button
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CaesarD.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void switchtoHillD(ActionEvent event) throws IOException { //Allows users to press "Hill" button
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HillD.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchtoDESD(ActionEvent event) throws IOException { //Allows users to press "DES" button
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DESD.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
