package com.duoc.clase;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //FXMLLoader busca y carga el archivo de formulario.
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("formulario.fxml"));
        //Scene representar el contenido de la ventana
        Scene scene = new Scene(fxmlLoader.load(),400,300);
        //stage es la ventana de la app
        stage.setTitle("Formulario JAVAFX POO");
        //poner la  scene dentro del stage
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
}


}
