package com.example.test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Arrays;
import javax.crypto.*;




//https://mkyong.com/java/jce-encryption-data-encryption-standard-des-tutorial/
//Parts of the code was derived from the website above.

public class DESController {
    //Declaring a variety of buttons, labels, text fields for the user to see
    @FXML
    private Label questionDes;

    @FXML
    private Button submitDes;

    @FXML
    private TextField DesTextField;

    String inputDes;

    public void submitDes(ActionEvent event){
        try{
            //This is a key generator instance imported from the DES library to generate a unique key.
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keyGenerator.generateKey();
            Cipher desCipher;

            //Constructs the Cipher from the imported instance
            desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

            //Initializing the Cipher for encryption function
            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);

            //Storing the input gathered from the textfield into a string named inputDes
            String inputDes = DesTextField.getText();

            //Storing the input into a byte array after converting the input into bytes
            byte[] bytesInput = inputDes.getBytes();

            byte[] inputEncrypted = desCipher.doFinal(bytesInput);


            //Gathering the output and changing the label to display the output of the encryption
            questionDes.setText("Output: " + (inputEncrypted));



            // A variety of exceptions included in the library
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
