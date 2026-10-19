package com.duoc.escenas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class App extends Application {
    @Override
    public void init(){
        System.out.println("1. init(): Preparando aplicación");

    }
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("2. start(): Creando Interfaz");

        FXMLLoader loaderInicio = new FXMLLoader(
                getClass().getResource("/views/inicio.fxml")
        );

        Parent rootInicio = loaderInicio.load();

        Scene escenaInicio = new Scene(rootInicio,500,300);

        FXMLLoader loaderPanel = new FXMLLoader(
                getClass().getResource("/views/panel.fxml")
        );

        Parent rootPanel = loaderPanel.load();

        Scene escenaPanel = new Scene(rootPanel, 500, 300);

        String css = getClass()
                .getResource("/css/estilos.css")
                .toExternalForm();
        escenaInicio.getStylesheets().add(css);
        escenaPanel.getStylesheets().add(css);
        Button btnEntrar = (Button) rootInicio.lookup("#btnEntrar");
        Button btnVolver = (Button) rootPanel.lookup("#btnVolver");
        btnEntrar.setOnAction(event -> stage.setScene(escenaPanel));
        btnVolver.setOnAction(event -> stage.setScene(escenaInicio));
        stage.setTitle("Escenas JAVAFX");
        stage.setScene(escenaInicio);
        stage.show();
    }
    @Override
    public void stop() {
        System.out.println("3. stop(): Aplicación finalizada");
    }

    public static void main(String[] args){
        launch(args);
    }
}
