package service;

import model.RutaTuristica;

import java.util.ArrayList;

public class RutaService {
    private ArrayList<RutaTuristica> rutas;

    public RutaService() {
        this.rutas = new ArrayList<>();
        cargarRutasBase();
    }

    private void cargarRutasBase() {
        rutas.add(new RutaTuristica("R001", "Ruta gastronómica Frutillar", "Gastronómica", "Frutillar"));
        rutas.add(new RutaTuristica("R002", "Paseo lacustre Puerto Varas", "Lacustre", "Puerto Varas"));
        rutas.add(new RutaTuristica("R003", "Circuito cultural Llanquihue", "Cultural", "Llanquihue"));
    }

    public ArrayList<RutaTuristica> getRutas() {
        return rutas;
    }

    public void mostrarRutas() {
        for (RutaTuristica ruta : rutas) {
            System.out.println(ruta);
        }
    }
}
