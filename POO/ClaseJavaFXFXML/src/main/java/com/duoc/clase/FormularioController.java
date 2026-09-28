package com.duoc.clase;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FormularioController {
    @FXML
    private TextField txtNombre;
    @FXML
    private ComboBox<String> cmbTipo;

    @FXML
    private Label lblResultado;

    @FXML
    public void initialize(){
        cmbTipo.getItems().add("Estudiante");
        cmbTipo.getItems().add("Docente");
        cmbTipo.getItems().add("Femboy");
        cmbTipo.getItems().add("Peruano");

    }
    @FXML
    private void registrar(){
        String nombre = txtNombre.getText();
        String tipo = cmbTipo.getValue();
        if (nombre.isBlank()){
            lblResultado.setText("Ingresa un nombre");
        }
        if (tipo==null){
            lblResultado.setText("Ingrese un tipo");
        }
        else {
            lblResultado.setText("Bienvenido " + nombre + " Rol: " + tipo);
        }

    }

}

