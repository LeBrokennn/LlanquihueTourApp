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

        if (!ValidadorRut.validar(rut)) {
            throw new RutInvalidoException(
                    "El RUT ingresado no es válido."
            );
        }

        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public abstract String obtenerTipo();

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws RutInvalidoException {

        if (!ValidadorRut.validar(rut)) {
            throw new RutInvalidoException(
                    "El RUT ingresado no es válido."
            );
        }

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

    @Override
    public void registrar() {
        System.out.println(
                obtenerTipo() + " registrado correctamente."
        );
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nTipo: " + obtenerTipo()
                + "\nRUT: " + rut
                + "\nNombre: " + nombre
                + "\nTeléfono: " + telefono
                + "\nCorreo: " + correo
                + "\nDirección: " + direccion;
    }
}