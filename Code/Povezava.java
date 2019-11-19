package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.lang.*;



public class Povezava extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       //oknu damo ime povezava
        primaryStage.setTitle("Povezava");
        Parent root = FXMLLoader.load(getClass().getResource("LoginS.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
