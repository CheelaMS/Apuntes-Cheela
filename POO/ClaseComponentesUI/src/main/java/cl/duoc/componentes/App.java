package cl.duoc.componentes;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

import javafx.stage.Stage;



public class App extends Application {



    @Override

    public void start(Stage stage) throws Exception {



        // 1. Cargamos nuestra interfaz FXML.

        FXMLLoader loader =

                new FXMLLoader(App.class.getResource("actividad.fxml"));



        // 2. Creamos la escena.

        Scene scene = new Scene(loader.load(), 600, 650);



        // 3. Aplicamos nuestro archivo CSS.

        scene.getStylesheets().add(

                App.class.getResource("estilos.css").toExternalForm()

        );



        // 4. Configuramos la ventana.

        stage.setTitle("Registro de actividad");

        stage.setScene(scene);

        stage.show();

    }



    public static void main(String[] args) {

        launch();

    }

}