package model;

public class GuiaTuristico extends RecursoAgencia {

    private String especialidad;
    private String idioma;

    public GuiaTuristico(int id, String nombre, String especialidad, String idioma) {
        super(id, nombre);
        this.especialidad = especialidad;
        this.idioma = idioma;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getIdioma() {
        return idioma;
    }

    @Override
    public String mostrarResumen() {
        return "Guía turístico: " + getNombre()
                + "\nID: " + getId()
                + "\nEspecialidad: " + especialidad
                + "\nIdioma: " + idioma;
    }
}