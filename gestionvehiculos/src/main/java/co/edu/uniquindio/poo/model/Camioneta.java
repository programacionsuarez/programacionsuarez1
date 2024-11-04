package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo {
    private double capacidadCarga;

    public Camioneta(String matricula, String marca, String modelo, double capacidadCarga) {
        super(matricula, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public double calcularCostoReserva(int dias) {
    return dias * 10000 + (capacidadCarga * 1000); // Tarifa base + extra por tonelada
    }

}
