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

public class Scene1Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label questionText;

    @FXML
    private Button encrypt;

    @FXML
    private Button decrypt;

    public void E(ActionEvent event) throws IOException { //Allows users to press "Encrypt" button
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("EncryptionOptionsScreen.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void D(ActionEvent event) throws IOException { //Allows users to press "Decrypt" button
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DecryptionOptionsScreen.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
