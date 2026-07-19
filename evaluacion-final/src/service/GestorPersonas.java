package service;

import model.PersonaTuristica;

import java.util.ArrayList;
import java.util.List;

public class GestorPersonas {

    private final List<PersonaTuristica> personas;

    public GestorPersonas() {
        personas = new ArrayList<>();
    }

    public boolean agregarPersona(PersonaTuristica persona) {

        if (persona == null) {
            return false;
        }

        if (buscarPorRut(persona.getRut()) != null) {
            return false;
        }

        personas.add(persona);
        return true;
    }

    public PersonaTuristica buscarPorRut(String rut) {

        for (PersonaTuristica persona : personas) {

            if (persona.getRut().equalsIgnoreCase(rut)) {
                return persona;
            }
        }

        return null;
    }

    public List<PersonaTuristica> buscarPorNombre(String nombre) {

        List<PersonaTuristica> resultados = new ArrayList<>();

        for (PersonaTuristica persona : personas) {

            if (persona.getNombre()
                    .toLowerCase()
                    .contains(nombre.toLowerCase())) {

                resultados.add(persona);
            }
        }

        return resultados;
    }

    public List<PersonaTuristica> filtrarPorTipo(String tipo) {

        List<PersonaTuristica> resultados = new ArrayList<>();

        for (PersonaTuristica persona : personas) {

            if (persona.obtenerTipo().equalsIgnoreCase(tipo)) {
                resultados.add(persona);
            }
        }

        return resultados;
    }

    public boolean eliminarPorRut(String rut) {

        PersonaTuristica personaEncontrada = buscarPorRut(rut);

        if (personaEncontrada == null) {
            return false;
        }

        personas.remove(personaEncontrada);
        return true;
    }

    public List<PersonaTuristica> obtenerPersonas() {
        return new ArrayList<>(personas);
    }

    public int obtenerCantidadPersonas() {
        return personas.size();
    }
}