package cl.duoc.salmondelsur.controller;

import cl.duoc.salmondelsur.dao.LoteMySQLDAO;
import cl.duoc.salmondelsur.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

// ACTIVIDAD 3: implementar los eventos y la interacción FXML-DAO.
public class LoteController {
    @FXML private ComboBox<String> tipo;
    @FXML private TextField codigo, centro, kilos;
    @FXML private ListView<LoteSalmon> lista;
    @FXML private Label mensaje;
    private final LoteMySQLDAO dao = new LoteMySQLDAO();

    @FXML private void initialize() {
        tipo.getItems().addAll("FRESCO", "CONGELADO");
        //  llamar a cargar() e informar errores de conexión.
        try{
            cargar();
        }catch (RuntimeException e){
            mensaje.setText(e.getMessage());
        }
    }

    //  consultar dao.listar() y mostrar resultados en ListView.
    private void cargar()  {
        lista.getItems().setAll(dao.listar());
    }

    // Done: obtener seleccionado y copiar sus datos al formulario.
    @FXML private void seleccionar() {
        LoteSalmon lote = lista.getSelectionModel().getSelectedItem();

        if (lote == null) return;

        tipo.setValue(lote.getTipo());
        codigo.setText(lote.getCodigo());
        centro.setText(lote.getCentro());
        kilos.setText(String.valueOf(lote.getKilos()));

    }

    // Done: validar, crear clase hija y usar dao.guardar(...).
    @FXML private void guardar() {
        try{
            if(tipo.getValue() == null) {
                mensaje.setText("seleccione tipo");
                return;
            }
            //kg = kilos transformado de texto a int
            int kg =  Integer.parseInt(kilos.getText().trim());

            LoteSalmon seleccionado = lista.getSelectionModel().getSelectedItem();
            int id = 0;
            if (seleccionado != null) {
                id = seleccionado.getId();
            }

            LoteSalmon lote;
            if ("FRESCO".equals(tipo.getValue())) {
                lote = new LoteFresco(id, codigo.getText(),centro.getText(), kg);
            } else {
                lote = new LoteCongelado(id, codigo.getText(), centro.getText(), kg);
            }

            dao.guardar(lote);
            cargar();
            limpiar();
            mensaje.setText("Lote guardado");
        } catch (NumberFormatException e) {
            mensaje.setText("Kilos debe ser un numero entero.");
        } catch (RuntimeException e){
            mensaje.setText("Error" + e.getMessage());
        }
    }

    // Done: eliminar por ID y actualizar la lista.
    @FXML private void eliminar() {
        LoteSalmon lote = lista.getSelectionModel().getSelectedItem();
        if (lote == null) {
            mensaje.setText("Seleccione un lote");
            return;
        }

        try {
            dao.eliminar(lote.getId());
            cargar();
            limpiar();
            mensaje.setText("Lote eliminado");
        } catch (RuntimeException e){
            mensaje.setText("Error" + e.getMessage());
        }
    }

    // Done: borrar selección y campos.
    @FXML private void limpiar() {
        lista.getSelectionModel().clearSelection();
        tipo.setValue(null);
        codigo.clear();
        centro.clear();
        kilos.clear();;
    }
}
