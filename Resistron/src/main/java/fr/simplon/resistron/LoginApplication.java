package fr.simplon.resistron;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;
/** This is an application for logging in.*/
public class LoginApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resistron.fxml"));
        Stage stage = loader.load();

        stage.setTitle("Resistron");
        stage.show();
    }
}
