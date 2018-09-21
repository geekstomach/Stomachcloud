package com.gb.cloud.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/auth.fxml")); //загружаем интерфейс из файла
        primaryStage.setTitle("StomachCloud Client"); //создаем окно
        primaryStage.setScene(new Scene(root)); //
        primaryStage.show(); //показать окно
    }


    public static void main(String[] args) {
        launch(args);
    }
}
