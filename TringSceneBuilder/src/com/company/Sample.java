package com.company;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Sample extends Application {
    private Stage primaryStage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        this.primaryStage = primaryStage;
        Parent root;

        root = FXMLLoader.load(getClass().getResource("src/com.company/Sample.fxml"));

        System.out.println("outside");
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root,800,500));
        primaryStage.show();
    }

    public static void loginButtonClicked()
    {
        System.out.println("Login Button Clicked");
    }
}
