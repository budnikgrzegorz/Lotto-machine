package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("POLISH LOTTO MACHINE");
        Scene scene = new Scene(root, 701, 600);
        primaryStage.getIcons().add(new Image("image/lotto_z_bialym_obrysem.png"));
        primaryStage.setScene(scene);
        scene.getStylesheets().add("style/styleRoot.css");
        primaryStage.show();

    }


    public static void main(String[] args) {launch(args);
    }
}
