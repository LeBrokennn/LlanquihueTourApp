package ui;

import data.GestorServicios;

public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA LLANQUIHUE TOUR");
        System.out.println("Aplicando polimorfismo y colecciones genericas");
        System.out.println();

        GestorServicios gestor = new GestorServicios();
        gestor.mostrarServicios();
    }
}
