package cl.duoc.tabla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Creamos el controller de la pantalla.
        AlumnoController controller = new AlumnoController();

        // Creamos la escena usando la vista del controller.
        Scene scene = new Scene(controller.crearVista(), 620, 400);

        // Configuramos la ventana principal.
        stage.setTitle("Tabla de alumnos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Inicia la aplicación JavaFX.
        launch();
    }
}
