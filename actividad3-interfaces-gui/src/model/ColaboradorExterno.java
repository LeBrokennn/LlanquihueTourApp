package model;

public class ColaboradorExterno extends RecursoAgencia {

    private String servicio;
    private String telefono;

    public ColaboradorExterno(int id, String nombre, String servicio, String telefono) {
        super(id, nombre);
        this.servicio = servicio;
        this.telefono = telefono;
    }

    public String getServicio() {
        return servicio;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador externo: " + getNombre()
                + "\nID: " + getId()
                + "\nServicio: " + servicio
                + "\nTeléfono: " + telefono;
    }
}