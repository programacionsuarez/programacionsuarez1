package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
    private boolean automatica;

    public Moto(String matricula, String marca, String modelo, boolean automatica) {
        super(matricula, marca, modelo);
        this.automatica = automatica;
    }


    public boolean isAutomatica() {
        return automatica;
    }

    @Override
    public double calcularCostoReserva(int dias) {
    return dias * (automatica ? 6000 : 5000);
    }
    
}
