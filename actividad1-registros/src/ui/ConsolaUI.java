package ui;

import model.PersonaTuristica;

import java.util.ArrayList;

public class ConsolaUI {
    public void mostrarTitulo(String titulo) {
        System.out.println();
        System.out.println("==============================================");
        System.out.println(titulo);
        System.out.println("==============================================");
    }

    public void mostrarLista(ArrayList<PersonaTuristica> lista) {
        if (lista == null || lista.isEmpty()) {
            System.out.println("No se encontraron resultados.");
            return;
        }

        for (PersonaTuristica persona : lista) {
            System.out.println(persona);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
