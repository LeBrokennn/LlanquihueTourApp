package service;

import model.Contacto;
import model.PersonaTuristica;
import util.ValidadorDatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RegistroService {
    private ArrayList<PersonaTuristica> registros;

    public RegistroService() {
        this.registros = new ArrayList<>();
    }

    public ArrayList<PersonaTuristica> getRegistros() {
        return registros;
    }

    public void cargarDesdeArchivo(String rutaArchivo) {
        registros.clear();

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea = lector.readLine();

            while ((linea = lector.readLine()) != null) {
                try {
                    String[] datos = linea.split(";");

                    String rut = ValidadorDatos.obtenerCampo(datos, 0);
                    String nombre = ValidadorDatos.obtenerCampo(datos, 1);
                    String tipo = ValidadorDatos.obtenerCampo(datos, 2);
                    String comuna = ValidadorDatos.obtenerCampo(datos, 3);
                    String especialidad = ValidadorDatos.obtenerCampo(datos, 4);
                    String telefono = ValidadorDatos.obtenerCampo(datos, 5);
                    String email = ValidadorDatos.obtenerCampo(datos, 6);

                    if (!ValidadorDatos.textoValido(rut) || !ValidadorDatos.textoValido(nombre)) {
                        System.out.println("Registro omitido por datos incompletos: " + linea);
                        continue;
                    }

                    if (!ValidadorDatos.emailValido(email)) {
                        email = "correo.no.validado@llanquihuetour.cl";
                    }

                    Contacto contacto = new Contacto(telefono, email);
                    PersonaTuristica persona = new PersonaTuristica(rut, nombre, tipo, comuna, especialidad, contacto);
                    registros.add(persona);

                } catch (IllegalArgumentException e) {
                    System.out.println("Error al validar registro: " + e.getMessage());
                }
            }

            System.out.println("Carga finalizada. Registros cargados: " + registros.size());

        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }
    }

    public void mostrarTodos() {
        if (registros.isEmpty()) {
            System.out.println("No existen registros cargados.");
            return;
        }

        for (PersonaTuristica persona : registros) {
            System.out.println(persona);
        }
    }

    public ArrayList<PersonaTuristica> buscarPorNombre(String nombreBuscado) {
        ArrayList<PersonaTuristica> encontrados = new ArrayList<>();

        for (PersonaTuristica persona : registros) {
            if (persona.getNombre().toLowerCase().contains(nombreBuscado.toLowerCase())) {
                encontrados.add(persona);
            }
        }

        return encontrados;
    }

    public ArrayList<PersonaTuristica> filtrarPorTipo(String tipoBuscado) {
        ArrayList<PersonaTuristica> filtrados = new ArrayList<>();

        for (PersonaTuristica persona : registros) {
            if (persona.getTipo().equalsIgnoreCase(tipoBuscado)) {
                filtrados.add(persona);
            }
        }

        return filtrados;
    }

    public ArrayList<PersonaTuristica> filtrarPorComuna(String comunaBuscada) {
        ArrayList<PersonaTuristica> filtrados = new ArrayList<>();

        for (PersonaTuristica persona : registros) {
            if (persona.getComuna().equalsIgnoreCase(comunaBuscada)) {
                filtrados.add(persona);
            }
        }

        return filtrados;
    }
}
