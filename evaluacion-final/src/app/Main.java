package app;

import exception.RutInvalidoException;
import model.Cliente;
import model.Direccion;
import model.GuiaTuristico;
import model.OperadorTuristico;
import model.PersonaTuristica;
import model.ProveedorAlojamiento;
import service.GestorPersonas;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final GestorPersonas gestor = new GestorPersonas();

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;

                case 2:
                    registrarGuia();
                    break;

                case 3:
                    registrarOperador();
                    break;

                case 4:
                    registrarProveedor();
                    break;

                case 5:
                    mostrarTodos();
                    break;

                case 6:
                    buscarPorRut();
                    break;

                case 7:
                    buscarPorNombre();
                    break;

                case 8:
                    eliminarPorRut();
                    break;

                case 9:
                    mostrarCantidad();
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n==============================");
        System.out.println("     LLANQUIHUE TOUR APP");
        System.out.println("==============================");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Registrar guía turístico");
        System.out.println("3. Registrar operador turístico");
        System.out.println("4. Registrar proveedor de alojamiento");
        System.out.println("5. Mostrar todos los registros");
        System.out.println("6. Buscar persona por RUT");
        System.out.println("7. Buscar persona por nombre");
        System.out.println("8. Eliminar persona por RUT");
        System.out.println("9. Mostrar cantidad de registros");
        System.out.println("0. Salir");
        System.out.println("==============================");
    }

    private static void registrarCliente() {
        try {
            String rut = leerTexto("RUT: ");
            String nombre = leerTexto("Nombre: ");
            String telefono = leerTexto("Teléfono: ");
            String correo = leerTexto("Correo: ");
            Direccion direccion = crearDireccion();

            String preferencias = leerTexto("Preferencias turísticas: ");
            int cantidadReservas = leerEntero("Cantidad de reservas: ");

            Cliente cliente = new Cliente(
                    rut,
                    nombre,
                    telefono,
                    correo,
                    direccion,
                    preferencias,
                    cantidadReservas
            );

            guardarPersona(cliente);

        } catch (RutInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void registrarGuia() {
        try {
            String rut = leerTexto("RUT: ");
            String nombre = leerTexto("Nombre: ");
            String telefono = leerTexto("Teléfono: ");
            String correo = leerTexto("Correo: ");
            Direccion direccion = crearDireccion();

            String especialidad = leerTexto("Especialidad: ");
            int aniosExperiencia = leerEntero("Años de experiencia: ");

            GuiaTuristico guia = new GuiaTuristico(
                    rut,
                    nombre,
                    telefono,
                    correo,
                    direccion,
                    especialidad,
                    aniosExperiencia
            );

            guardarPersona(guia);

        } catch (RutInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void registrarOperador() {
        try {
            String rut = leerTexto("RUT: ");
            String nombre = leerTexto("Nombre: ");
            String telefono = leerTexto("Teléfono: ");
            String correo = leerTexto("Correo: ");
            Direccion direccion = crearDireccion();

            String tipoTransporte = leerTexto("Tipo de transporte: ");
            int capacidad = leerEntero("Capacidad de personas: ");

            OperadorTuristico operador = new OperadorTuristico(
                    rut,
                    nombre,
                    telefono,
                    correo,
                    direccion,
                    tipoTransporte,
                    capacidad
            );

            guardarPersona(operador);

        } catch (RutInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void registrarProveedor() {
        try {
            String rut = leerTexto("RUT: ");
            String nombre = leerTexto("Nombre: ");
            String telefono = leerTexto("Teléfono: ");
            String correo = leerTexto("Correo: ");
            Direccion direccion = crearDireccion();

            String nombreAlojamiento = leerTexto("Nombre del alojamiento: ");
            int cantidadHabitaciones = leerEntero(
                    "Cantidad de habitaciones: "
            );

            ProveedorAlojamiento proveedor =
                    new ProveedorAlojamiento(
                            rut,
                            nombre,
                            telefono,
                            correo,
                            direccion,
                            nombreAlojamiento,
                            cantidadHabitaciones
                    );

            guardarPersona(proveedor);

        } catch (RutInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static Direccion crearDireccion() {
        System.out.println("\nDatos de dirección");

        String calle = leerTexto("Calle: ");
        String numero = leerTexto("Número: ");
        String comuna = leerTexto("Comuna: ");
        String region = leerTexto("Región: ");

        return new Direccion(
                calle,
                numero,
                comuna,
                region
        );
    }

    private static void guardarPersona(PersonaTuristica persona) {

        boolean agregado = gestor.agregarPersona(persona);

        if (agregado) {
            persona.registrar();
        } else {
            System.out.println(
                    "No fue posible registrar la persona. "
                            + "El RUT ya existe."
            );
        }
    }

    private static void mostrarTodos() {

        List<PersonaTuristica> personas =
                gestor.obtenerPersonas();

        if (personas.isEmpty()) {
            System.out.println("No existen registros.");
            return;
        }

        for (PersonaTuristica persona : personas) {
            System.out.println(persona);
            System.out.println("------------------------------");
        }
    }

    private static void buscarPorRut() {

        String rut = leerTexto("Ingrese el RUT a buscar: ");

        PersonaTuristica persona =
                gestor.buscarPorRut(rut);

        if (persona == null) {
            System.out.println("No se encontró el RUT.");
        } else {
            persona.mostrarDatos();
        }
    }

    private static void buscarPorNombre() {

        String nombre = leerTexto(
                "Ingrese el nombre a buscar: "
        );

        List<PersonaTuristica> resultados =
                gestor.buscarPorNombre(nombre);

        if (resultados.isEmpty()) {
            System.out.println(
                    "No se encontraron coincidencias."
            );
            return;
        }

        for (PersonaTuristica persona : resultados) {
            persona.mostrarDatos();
            System.out.println("------------------------------");
        }
    }

    private static void eliminarPorRut() {

        String rut = leerTexto(
                "Ingrese el RUT que desea eliminar: "
        );

        boolean eliminado =
                gestor.eliminarPorRut(rut);

        if (eliminado) {
            System.out.println(
                    "Registro eliminado correctamente."
            );
        } else {
            System.out.println(
                    "No se encontró un registro con ese RUT."
            );
        }
    }

    private static void mostrarCantidad() {
        System.out.println(
                "Cantidad total de registros: "
                        + gestor.obtenerCantidadPersonas()
        );
    }

    private static String leerTexto(String mensaje) {

        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    private static int leerEntero(String mensaje) {

        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(
                        scanner.nextLine().trim()
                );

            } catch (NumberFormatException e) {
                System.out.println(
                        "Debe ingresar un número válido."
                );
            }
        }
    }
}