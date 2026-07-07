package app;

import model.AsignacionRuta;
import model.PersonaTuristica;
import model.RutaTuristica;
import service.RegistroService;
import service.RutaService;
import ui.ConsolaUI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RegistroService registroService = new RegistroService();
        RutaService rutaService = new RutaService();
        ConsolaUI consola = new ConsolaUI();

        consola.mostrarTitulo("LLANQUIHUE TOUR - SISTEMA DE REGISTROS");
        registroService.cargarDesdeArchivo("data/personas.csv");

        consola.mostrarTitulo("1. Registros cargados desde archivo");
        registroService.mostrarTodos();

        consola.mostrarTitulo("2. Filtro por tipo: Guía");
        ArrayList<PersonaTuristica> guias = registroService.filtrarPorTipo("Guía");
        consola.mostrarLista(guias);

        consola.mostrarTitulo("3. Filtro por comuna: Puerto Varas");
        ArrayList<PersonaTuristica> puertoVaras = registroService.filtrarPorComuna("Puerto Varas");
        consola.mostrarLista(puertoVaras);

        consola.mostrarTitulo("4. Búsqueda simple por nombre: Ana");
        ArrayList<PersonaTuristica> busqueda = registroService.buscarPorNombre("Ana");
        consola.mostrarLista(busqueda);

        consola.mostrarTitulo("5. Rutas turísticas disponibles");
        rutaService.mostrarRutas();

        consola.mostrarTitulo("6. Ejemplo de composición entre clases");
        if (!registroService.getRegistros().isEmpty() && !rutaService.getRutas().isEmpty()) {
            PersonaTuristica persona = registroService.getRegistros().get(0);
            RutaTuristica ruta = rutaService.getRutas().get(0);
            AsignacionRuta asignacion = new AsignacionRuta(persona, ruta, "Mañana");
            consola.mostrarMensaje(asignacion.toString());
        }

        consola.mostrarTitulo("Ejecución finalizada");
    }
}
