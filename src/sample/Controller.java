package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Random;


public class Controller {


    @FXML
    Button big;

    @FXML
    TextField bigText;

    @FXML
    Button mini;

    @FXML
    TextField miniText;

    @FXML
    Button multi;

    @FXML
    Button textMulti;

    @FXML
    Button eurojackpot;

    @FXML
    Button textEuro;

    public void initialize() {

        big.setOnAction(event -> {
            bigText.setText(String.valueOf(Calculations.bigLotto()));
        });

        mini.setOnAction(event -> {
            miniText.setText(String.valueOf(Calculations.miniLotto()));
        });

    }

    int a;
}
