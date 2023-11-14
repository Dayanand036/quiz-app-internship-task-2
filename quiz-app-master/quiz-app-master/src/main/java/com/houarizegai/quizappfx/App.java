package com.houarizegai.quizappfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

    // A static reference to the main application window
    public static Stage stage = null;

    @Override
    public void start(Stage stage) throws Exception {
        // Load the UI layout from the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("/views/JavaQuiz.fxml"));

        // Create a scene and set the UI layout as its root
        Scene scene = new Scene(root);

        // Set the stage (main window) to use the UNDECORATED style
        stage.initStyle(StageStyle.UNDECORATED);

        // Set the title of the application window
        stage.setTitle("Java Quiz");

        // Associate the scene with the stage
        stage.setScene(scene);

        // Assign the stage to the static stage variable for later access
        App.stage = stage;

        // Show the application window
        stage.show();
    }
}
