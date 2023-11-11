package com.example.courierms.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AppInitializer extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(AppInitializer.class.getResource("view/MainForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Courier Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

