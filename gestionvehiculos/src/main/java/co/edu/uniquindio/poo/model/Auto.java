package co.edu.uniquindio.poo.model;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String matricula, String marca, String modelo, int puertas) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }
   
    public int getPuertas() {
        return puertas;
    }

    @Override
    public double calcularCostoReserva(int dias) {
    return dias * 10000; // Ejemplo de costo base
    }
}
