package com.example.test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;


//https://mkyong.com/java/jce-encryption-data-encryption-standard-des-tutorial/
//Parts of the code was derived from the website above.

public class DESDController {

    //Declaring a variety of buttons, labels, text fields for the user to see

    @FXML
    private Label questionDesD;

    @FXML
    private Label CipherTextDesD;

    @FXML
    private Button submitDesD;

    @FXML
    private TextField DesTextFieldD;

    String inputDesD;

    public void submitDesD(ActionEvent event){
        try{
            //This is a key generator instance imported from the DES library to generate a unique key.
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keyGenerator.generateKey();
            Cipher desCipher;



            //Constructs the Cipher from the imported instance
            desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);


            //Gathers the input from the Textfield and storing the input into a String variable
            String inputDesD = DesTextFieldD.getText();

            //Storing the converted contents from the input into byte array
            byte[] bytesInput = inputDesD.getBytes();

            byte [] inputEncrypted = desCipher.doFinal(bytesInput);


            //Initializing the Cipher for decryption function
            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);


            // Calling the function to decrypt the input
            byte[] inputDecrypted = desCipher.doFinal(inputEncrypted);


            //Outputting the decrypted data by changing the question label to the output
            questionDesD.setText("Decryption: " + ((inputEncrypted)));
            CipherTextDesD.setText("Original Text: " + new String(inputDecrypted));

        // A variety of exceptions including on the library
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }catch(NoSuchPaddingException e){
            e.printStackTrace();
        } catch(IllegalBlockSizeException e){
            e.printStackTrace();
        }catch(BadPaddingException e){
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }


    }


}
