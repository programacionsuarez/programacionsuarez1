package co.edu.uniquindio.poo.controller;


import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class VehiculoController {
    @FXML private ComboBox<String> tipoVehiculoComboBox;
    @FXML private TextField matriculaField;
    @FXML private TextField marcaField;
    @FXML private TextField modeloField;
    @FXML private TextField añoField;
    @FXML private TextField diasField;
    @FXML private Label costoLabel;

    @FXML
    private void calcularCosto() {
        String tipo = tipoVehiculoComboBox.getValue();
        String matricula = matriculaField.getText();
        String marca = marcaField.getText();
        String modelo = modeloField.getText();
        int dias = Integer.parseInt(diasField.getText());

        Vehiculo vehiculo;

        switch (tipo) {
            case "Auto":
                vehiculo = new Auto(matricula, marca, modelo, 4); // Ejemplo de 4 puertas
                break;
            case "Moto":
                vehiculo = new Moto(matricula, marca, modelo, true); // Ejemplo automática
                break;
            case "Camioneta":
                vehiculo = new Camioneta(matricula, marca, modelo, 2.5); // Ejemplo 2.5 toneladas
                break;
            default:
                throw new IllegalArgumentException("Tipo de vehículo no soportado");
        }

        double costo = vehiculo.calcularCostoReserva(dias);
        costoLabel.setText("Costo de reserva: $" + costo);
    }
}
