package model;

import exception.RutInvalidoException;
import interfaces.Registrable;
import util.ValidadorRut;

public abstract class PersonaTuristica implements Registrable {

    private String rut;
    private String nombre;
    private String telefono;
    private String correo;
    private Direccion direccion;

    public PersonaTuristica(
            String rut,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion
    ) throws RutInvalidoException {

        ValidadorRut.validar(rut);

        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws RutInvalidoException {
        ValidadorRut.validar(rut);
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return direccion.getComuna();
    }

    public abstract String obtenerTipo();

    @Override
    public String toString() {
        return "RUT: " + rut
                + ", nombre: " + nombre
                + ", teléfono: " + telefono
                + ", correo: " + correo
                + ", dirección: " + direccion;
    }
}