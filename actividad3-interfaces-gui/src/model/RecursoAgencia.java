package model;

public abstract class RecursoAgencia implements Registrable {

    private int id;
    private String nombre;

    public RecursoAgencia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}