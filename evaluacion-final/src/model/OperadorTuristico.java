package model;

import exception.RutInvalidoException;

public class OperadorTuristico extends PersonaTuristica {

    private String tipoTransporte;
    private int capacidadPersonas;

    public OperadorTuristico(
            String rut,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            String tipoTransporte,
            int capacidadPersonas
    ) throws RutInvalidoException {

        super(rut, nombre, telefono, correo, direccion);

        this.tipoTransporte = tipoTransporte;
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    @Override
    public String obtenerTipo() {
        return "Operador turístico";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo de transporte: " + tipoTransporte
                + "\nCapacidad de personas: " + capacidadPersonas;
    }
}