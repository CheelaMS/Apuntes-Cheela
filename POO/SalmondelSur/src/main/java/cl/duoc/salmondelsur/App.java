package cl.duoc.salmondelsur;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Inicializa JavaFX y carga la vista que implementarán los estudiantes.
public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent vista = FXMLLoader.load(App.class.getResource("main-view.fxml"));
        stage.setScene(new Scene(vista, 950, 470));
        stage.setTitle("Salmón del Sur - Gestión de lotes");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
