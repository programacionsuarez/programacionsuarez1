package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract double calcularCostoReserva(int dias);

}
