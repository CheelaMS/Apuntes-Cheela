package cl.duoc.componentes;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class ActividadController {
    @FXML private DatePicker fecha;
    @FXML private Slider dificultad;
    @FXML private Spinner<Integer> participantes;
    @FXML private CheckBox confirmada;
    @FXML private ColorPicker color;
    @FXML private ProgressBar progreso;
    @FXML
    private void registrar(){

        String mensaje=
                "Fecha: " + fecha.getValue() +
                        "\nDificultad: " + (int) dificultad.getValue() + "/10" +
                        "\nParticipantes: "+ participantes.getValue() +
                        "\nConfirmada: " + (confirmada.isSelected() ? "Si" : "No") +
                        "\nColor: " + color.getValue();

        progreso.setProgress(1.0);

        Alert alerta =
                new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Guaren Cigarro");
        alerta.setHeaderText("WORLD CHANGED");
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
