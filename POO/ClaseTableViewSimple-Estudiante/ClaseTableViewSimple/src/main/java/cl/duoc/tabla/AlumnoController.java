package cl.duoc.tabla;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class AlumnoController {

    private final ObservableList<Alumno> alumnos = FXCollections.observableArrayList();

    public VBox crearVista(){

        TableView<Alumno> tabla = new TableView<>();

        TableColumn<Alumno, String> colNombre = new TableColumn<>("Nombre");

        colNombre.setCellValueFactory(dato ->
                new SimpleStringProperty(dato.getValue().nombre()));


        TableColumn<Alumno, String> colCarrera = new TableColumn<>("Carrera");

        colCarrera.setCellValueFactory(dato ->
                new SimpleStringProperty(dato.getValue().carrera()));

        TableColumn<Alumno, Number> colNota = new TableColumn<>("Nota");

        colNota.setCellValueFactory(dato ->
                new SimpleDoubleProperty(dato.getValue().nota()));

        tabla.getColumns().addAll(colNombre,colCarrera,colNota);

        tabla.setItems(alumnos);

        alumnos.add(new Alumno("Jotape","Informatica",2.7));
        alumnos.add(new Alumno("Culian","Informatica",1.2));
        alumnos.add(new Alumno("Naxito","Valorant",6.2));

        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Nombre:");

        TextField txtCarrera = new TextField();
        txtCarrera.setPromptText("Carrera:");

        TextField txtNota = new TextField();
        txtNota.setPromptText("Nota:");

        Button btnAgregar = new Button("Agregar alumno");

        // Acción del botón.
        btnAgregar.setOnAction(evento -> {
            String nombre = txtNombre.getText();
            String carrera = txtCarrera.getText();
            double nota = Double.parseDouble(txtNota.getText());

            // Agregamos el alumno a la lista observable.
            alumnos.add(new Alumno(nombre, carrera, nota));

            // Limpiamos los campos.
            txtNombre.clear();
            txtCarrera.clear();
            txtNota.clear();
        });

        // VBox ordena los elementos de arriba hacia abajo.
        return new VBox(10, tabla, txtNombre, txtCarrera, txtNota, btnAgregar);


    }

}
