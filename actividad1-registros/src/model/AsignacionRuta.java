package model;

public class AsignacionRuta {
    private PersonaTuristica persona;
    private RutaTuristica ruta;
    private String turno;

    public AsignacionRuta() {
        this.persona = new PersonaTuristica();
        this.ruta = new RutaTuristica();
        this.turno = "Sin turno";
    }

    public AsignacionRuta(PersonaTuristica persona, RutaTuristica ruta, String turno) {
        setPersona(persona);
        setRuta(ruta);
        setTurno(turno);
    }

    public PersonaTuristica getPersona() {
        return persona;
    }

    public void setPersona(PersonaTuristica persona) {
        if (persona == null) {
            throw new IllegalArgumentException("La persona no puede ser nula.");
        }
        this.persona = persona;
    }

    public RutaTuristica getRuta() {
        return ruta;
    }

    public void setRuta(RutaTuristica ruta) {
        if (ruta == null) {
            throw new IllegalArgumentException("La ruta no puede ser nula.");
        }
        this.ruta = ruta;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno == null || turno.trim().isEmpty()) {
            this.turno = "Sin turno";
        } else {
            this.turno = turno.trim();
        }
    }

    @Override
    public String toString() {
        return "Asignación -> " + persona.getNombre()
                + " | " + ruta.getNombre()
                + " | Turno: " + turno;
    }
}
