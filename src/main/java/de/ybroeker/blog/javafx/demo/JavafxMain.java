package de.ybroeker.blog.javafx.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class JavafxMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX on JDK 11");

        Parent root = FXMLLoader.load(getClass().getResource("/test.fxml"));

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
