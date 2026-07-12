package model;

public class Vehiculo extends RecursoAgencia {

    private String patente;
    private int capacidad;

    public Vehiculo(int id, String nombre, String patente, int capacidad) {
        super(id, nombre);
        this.patente = patente;
        this.capacidad = capacidad;
    }

    public String getPatente() {
        return patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String mostrarResumen() {
        return "Vehículo: " + getNombre()
                + "\nID: " + getId()
                + "\nPatente: " + patente
                + "\nCapacidad: " + capacidad + " pasajeros";
    }
}