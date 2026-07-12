package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

public class GestorEntidades {

    private final ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public String mostrarTodas() {
        if (entidades.isEmpty()) {
            return "No existen entidades registradas.";
        }

        StringBuilder resumen = new StringBuilder();

        for (Registrable entidad : entidades) {
            resumen.append(entidad.mostrarResumen())
                    .append("\n-------------------------\n");
        }

        return resumen.toString();
    }

    public String mostrarPorTipo() {
        if (entidades.isEmpty()) {
            return "No existen entidades registradas.";
        }

        StringBuilder resultado = new StringBuilder();

        for (Registrable entidad : entidades) {

            if (entidad instanceof GuiaTuristico) {
                GuiaTuristico guia = (GuiaTuristico) entidad;
                resultado.append("GUÍA TURÍSTICO\n")
                        .append("Idioma: ")
                        .append(guia.getIdioma())
                        .append("\n");

            } else if (entidad instanceof Vehiculo) {
                Vehiculo vehiculo = (Vehiculo) entidad;
                resultado.append("VEHÍCULO\n")
                        .append("Capacidad: ")
                        .append(vehiculo.getCapacidad())
                        .append(" pasajeros\n");

            } else if (entidad instanceof ColaboradorExterno) {
                ColaboradorExterno colaborador = (ColaboradorExterno) entidad;
                resultado.append("COLABORADOR EXTERNO\n")
                        .append("Servicio: ")
                        .append(colaborador.getServicio())
                        .append("\n");
            }

            resultado.append("-------------------------\n");
        }

        return resultado.toString();
    }
}