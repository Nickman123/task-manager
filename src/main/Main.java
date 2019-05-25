package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("auth.fxml"));
        primaryStage.setTitle("Task Manager");
        primaryStage.setResizable(false);  // Запрещаем разворачивание окон
        primaryStage.setScene(new Scene(root, 600, 436));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
