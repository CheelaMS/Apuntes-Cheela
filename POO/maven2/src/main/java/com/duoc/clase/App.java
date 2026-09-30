package com.duoc.clase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException{
        FXMLLoader loader =
                new FXMLLoader(App.class.getResource("formulario.fxml"));
        Scene scene = new Scene(loader.load(), 450, 400);
        stage.setTitle("Registro de estudiantes");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch();
    }
}
