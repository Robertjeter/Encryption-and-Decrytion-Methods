package com.example.test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


// Handles the button functions for the Caesar Decryption
public class CaesarControllerD {

    @FXML
    private Label questionCaesarD;

    @FXML
    private Button submitD;

    @FXML
    private TextField CaesarTextFieldD;

    String inputD;

    public void submit(ActionEvent event){
        //Getting the input from the textfield
        inputD = CaesarTextFieldD.getText();

        //Storing the input into a character array
        char[] chars = inputD.toCharArray();

       String str = "";

       // Subtracting the ASCii value by 3 to simulate the shift
        for(char i: chars){
            i-=3; // Shift of 3
            str = str + i;
            System.out.print(i);
        }
        questionCaesarD.setText("Output: " + str);







    }


}
