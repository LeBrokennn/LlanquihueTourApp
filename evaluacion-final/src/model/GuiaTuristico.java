package model;

import exception.RutInvalidoException;

public class GuiaTuristico extends PersonaTuristica {
    private String especialidad;
    private int aniosExperiencia;

    public GuiaTuristico(
            String rut,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            String especialidad,
            int aniosExperiencia
    ) throws RutInvalidoException {

        super(rut, nombre, telefono, correo, direccion);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String obtenerTipo() {
        return "Guía turístico";
    }

    @Override
    public void registrar() {
        System.out.println("Guía registrado correctamente: " + getNombre());
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tipo: " + obtenerTipo()
                + ", " + super.toString()
                + ", especialidad: " + especialidad
                + ", años de experiencia: " + aniosExperiencia;
    }
}