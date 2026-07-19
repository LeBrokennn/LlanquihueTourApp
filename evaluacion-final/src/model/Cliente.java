package model;

import exception.RutInvalidoException;

public class Cliente extends PersonaTuristica {

    private String preferencias;
    private int cantidadReservas;

    public Cliente(
            String rut,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            String preferencias,
            int cantidadReservas
    ) throws RutInvalidoException {

        super(rut, nombre, telefono, correo, direccion);

        this.preferencias = preferencias;
        this.cantidadReservas = cantidadReservas;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public int getCantidadReservas() {
        return cantidadReservas;
    }

    public void setCantidadReservas(int cantidadReservas) {
        this.cantidadReservas = cantidadReservas;
    }

    @Override
    public String obtenerTipo() {
        return "Cliente";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPreferencias: " + preferencias
                + "\nCantidad de reservas: " + cantidadReservas;
    }
}