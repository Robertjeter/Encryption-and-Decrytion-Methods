package com.example.test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class CaesarController {

    @FXML
    private Label questionCaesar;

    @FXML
    private Button submit;

    @FXML
    private TextField CaesarTextField;

    String input;

    public void submit(ActionEvent event){
        input = CaesarTextField.getText(); // Taking the user input and storing it into "input" variable
        char[] chars = input.toCharArray(); // Creating an array named "char" and storing the individuals characters

       String str ="";

        for(char i: chars){ // incrementing the position of the characters according to ASCII or shifting right by 3
            i+=3; // number of keys in this case 3
            str = str + i;
            System.out.print(i);


        }
        questionCaesar.setText("Output: " + str);







    }


}
