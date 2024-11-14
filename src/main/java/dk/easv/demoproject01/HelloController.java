package dk.easv.demoproject01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void Github(){

        System.out.println("this dose nothing1234");
        System.out.println("This is the better text");
    }



}