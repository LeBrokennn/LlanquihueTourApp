package model;

public class PersonaTuristica {
    private String rut;
    private String nombre;
    private String tipo;
    private String comuna;
    private String especialidad;
    private Contacto contacto;

    public PersonaTuristica() {
        this.rut = "Sin rut";
        this.nombre = "Sin nombre";
        this.tipo = "Sin tipo";
        this.comuna = "Sin comuna";
        this.especialidad = "Sin especialidad";
        this.contacto = new Contacto();
    }

    public PersonaTuristica(String rut, String nombre, String tipo, String comuna, String especialidad, Contacto contacto) {
        setRut(rut);
        setNombre(nombre);
        setTipo(tipo);
        setComuna(comuna);
        setEspecialidad(especialidad);
        setContacto(contacto);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (rut == null || rut.trim().isEmpty()) {
            throw new IllegalArgumentException("El RUT no puede estar vacío.");
        }
        this.rut = rut.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo no puede estar vacío.");
        }
        this.tipo = tipo.trim();
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        if (comuna == null || comuna.trim().isEmpty()) {
            throw new IllegalArgumentException("La comuna no puede estar vacía.");
        }
        this.comuna = comuna.trim();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.trim().isEmpty()) {
            this.especialidad = "Sin especialidad";
        } else {
            this.especialidad = especialidad.trim();
        }
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        if (contacto == null) {
            this.contacto = new Contacto();
        } else {
            this.contacto = contacto;
        }
    }

    @Override
    public String toString() {
        return "RUT: " + rut
                + " | Nombre: " + nombre
                + " | Tipo: " + tipo
                + " | Comuna: " + comuna
                + " | Especialidad: " + especialidad
                + " | " + contacto;
    }
}
