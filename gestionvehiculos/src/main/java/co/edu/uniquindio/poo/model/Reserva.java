package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Reserva {
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private int dias;

    public Reserva(Vehiculo vehiculo, LocalDate fechaInicio, int dias) {
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.dias = dias;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public int getDias() {
        return dias;
    }

    public double calcularCosto() {
        return vehiculo.calcularCostoReserva(dias);
    }
}
