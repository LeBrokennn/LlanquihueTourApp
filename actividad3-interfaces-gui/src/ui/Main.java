package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();
        int opcion;

        do {
            String menu = """
                    LLANQUIHUE TOUR
                                        
                    1. Registrar guía turístico
                    2. Registrar vehículo
                    3. Registrar colaborador externo
                    4. Mostrar todas las entidades
                    5. Mostrar entidades por tipo
                    6. Salir
                    """;

            String entrada = JOptionPane.showInputDialog(
                    null,
                    menu,
                    "Sistema Llanquihue Tour",
                    JOptionPane.INFORMATION_MESSAGE
            );

            if (entrada == null) {
                opcion = 6;
            } else {
                try {
                    opcion = Integer.parseInt(entrada);

                    switch (opcion) {
                        case 1 -> registrarGuia(gestor);
                        case 2 -> registrarVehiculo(gestor);
                        case 3 -> registrarColaborador(gestor);
                        case 4 -> JOptionPane.showMessageDialog(
                                null,
                                gestor.mostrarTodas(),
                                "Entidades registradas",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                        case 5 -> JOptionPane.showMessageDialog(
                                null,
                                gestor.mostrarPorTipo(),
                                "Entidades por tipo",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                        case 6 -> JOptionPane.showMessageDialog(
                                null,
                                "Programa finalizado."
                        );
                        default -> JOptionPane.showMessageDialog(
                                null,
                                "Ingrese una opción válida."
                        );
                    }

                } catch (NumberFormatException e) {
                    opcion = 0;

                    JOptionPane.showMessageDialog(
                            null,
                            "Debe ingresar un número.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }

        } while (opcion != 6);
    }

    private static void registrarGuia(GestorEntidades gestor) {
        try {
            int id = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese el ID del guía:")
            );

            String nombre = JOptionPane.showInputDialog(
                    "Ingrese el nombre del guía:"
            );

            String especialidad = JOptionPane.showInputDialog(
                    "Ingrese la especialidad:"
            );

            String idioma = JOptionPane.showInputDialog(
                    "Ingrese el idioma:"
            );

            GuiaTuristico guia = new GuiaTuristico(
                    id,
                    nombre,
                    especialidad,
                    idioma
            );

            gestor.agregarEntidad(guia);

            JOptionPane.showMessageDialog(
                    null,
                    "Guía registrado correctamente."
            );

        } catch (NumberFormatException e) {
            mostrarErrorNumerico();
        }
    }

    private static void registrarVehiculo(GestorEntidades gestor) {
        try {
            int id = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese el ID del vehículo:")
            );

            String nombre = JOptionPane.showInputDialog(
                    "Ingrese el nombre o modelo:"
            );

            String patente = JOptionPane.showInputDialog(
                    "Ingrese la patente:"
            );

            int capacidad = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese la capacidad:")
            );

            Vehiculo vehiculo = new Vehiculo(
                    id,
                    nombre,
                    patente,
                    capacidad
            );

            gestor.agregarEntidad(vehiculo);

            JOptionPane.showMessageDialog(
                    null,
                    "Vehículo registrado correctamente."
            );

        } catch (NumberFormatException e) {
            mostrarErrorNumerico();
        }
    }

    private static void registrarColaborador(GestorEntidades gestor) {
        try {
            int id = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese el ID del colaborador:")
            );

            String nombre = JOptionPane.showInputDialog(
                    "Ingrese el nombre del colaborador:"
            );

            String servicio = JOptionPane.showInputDialog(
                    "Ingrese el servicio que realiza:"
            );

            String telefono = JOptionPane.showInputDialog(
                    "Ingrese el teléfono:"
            );

            ColaboradorExterno colaborador = new ColaboradorExterno(
                    id,
                    nombre,
                    servicio,
                    telefono
            );

            gestor.agregarEntidad(colaborador);

            JOptionPane.showMessageDialog(
                    null,
                    "Colaborador registrado correctamente."
            );

        } catch (NumberFormatException e) {
            mostrarErrorNumerico();
        }
    }

    private static void mostrarErrorNumerico() {
        JOptionPane.showMessageDialog(
                null,
                "El ID y la capacidad deben ser números.",
                "Error de ingreso",
                JOptionPane.ERROR_MESSAGE
        );
    }
}