package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    int a;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("POLISH LOTTO MACHINE");
        Scene scene = new Scene(root, 701, 600);
        primaryStage.setScene(scene);
        scene.getStylesheets().add("style/styleRoot.css");
        primaryStage.show();

    }


    public static void main(String[] args) {launch(args);
    }
}
