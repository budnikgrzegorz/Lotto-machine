package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;
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
    TextField textMulti;

    @FXML
    Button eurojackpot;

    @FXML
    TextField textEuro;

    @FXML
    ChoiceBox choiceBox;

    @FXML
    Button pensja;

    @FXML
    TextField textpensja;


    int flag = 1;

    public void initialize() {
        big.setOnAction(event -> {
            bigText.setText(Calculations.Calcul(6,49,0,0));
        });

        mini.setOnAction(event -> {
            miniText.setText(Calculations.Calcul(5,42,0,0));
        });

        multi.setOnAction(event -> {
            textMulti.setText(Calculations.Calcul(flag,80,0,0));
        });
        eurojackpot.setOnAction(event -> {
            textEuro.setText(Calculations.Calcul(5,50,2,10));
        });
        pensja.setOnAction(event -> {
            textpensja.setText(Calculations.Calcul(5,35,1,4));
        });

        choiceBox.setItems(FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));
        choiceBox.setValue("1");
        choiceBox.setTooltip(new Tooltip("Wybierz ile liczb chcesz obstawić"));
        int[] value = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        choiceBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue observable, Number oldValue, Number newValue) {
                flag = value[newValue.intValue()];
            }
        });

    }
}
