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
    Button textMulti;

    @FXML
    Button eurojackpot;

    @FXML
    Button textEuro;

    @FXML
    ChoiceBox choiceBox;
int flag = 0;

    public void initialize() {
        big.setOnAction(event -> {
            bigText.setText(String.valueOf(Calculations.bigLotto()));
        });

        mini.setOnAction(event -> {
            miniText.setText(String.valueOf(Calculations.miniLotto()));
        });

        multi.setOnAction(event -> {
            textMulti.setText(String.valueOf(Calculations.multiLotto(flag)));
        });

        choiceBox.setItems(FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));
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
