package com.example.test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.List;
import java.util.Locale;


public class HillController {
    // Declaring labels, textfields, and buttons for the user to interact with

    @FXML
    private Label questionHill;
    @FXML
    private Label keyHill;

    @FXML
    private Button submit;

    @FXML
    private TextField blockSize;

    @FXML
    private TextField HillTextField;

    String input;
    int block;


    public void submit(ActionEvent event) {
        // An alphabet array for the indexes
        String[] alphabet = {"A","B","C","D","E","F","G","H", "I", "J", "K", "L", "M", "N", "O", "P","Q", "R", "S", "T","U", "V", "W", "X", "Y", "Z"};

        //Getting the input from the textfield and storing it into a string variable while also forcing the string to be capitalized
        String input = HillTextField.getText().toUpperCase();

        //Storing the input into a character array so that the indexes could be accessed
        char[] alpha = input.toCharArray();

        //Getting the length of the input from the textfield
        int len = input.length();

        int[] arr = new int [len];

        // Setting the values of the inverse key for the calculating with the input indexes
        int[][] key ={{7,8}
                    , {11,11}};


        int[] result = new int[len];


        //A for loop subtracting each ASCii value by 65 to get the index and storing those values
        for(int i = 0; i < len; i++){
            arr[i] = alpha[i] - 65;
        }


        //Does the calculations of matrix multiplication
        for(int j = 0; j < len; j++){ // row
            for(int k = 0; k < len; k++){ // column
                result[j] += (key[j][k] * arr[k]);

            }



        }
        //Storing the resulted values into an empty string for easier output
        String strH = "";
       for(int i = 0; i < len; i++){
           strH += alphabet[result[i] % 26];
       }
       questionHill.setText("Output: " + strH);
    }
}


