package data;

import java.util.ArrayList;
import java.util.List;
import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {
    private List<ServicioTuristico> servicios;

    public GestorServicios() {
        servicios = new ArrayList<>();
        cargarServicios();
    }

    private void cargarServicios() {
        servicios.add(new RutaGastronomica("RG001", "Sabores del Sur", "Puerto Varas", 3, 25000, "Comida tipica alemana y chilota", 4));
        servicios.add(new PaseoLacustre("PL001", "Navegacion Lago Llanquihue", "Frutillar", 2, 18000, "Lago Llanquihue", true));
        servicios.add(new ExcursionCultural("EC001", "Historia de Frutillar", "Frutillar", 4, 22000, "Teatro del Lago", "Camila Rojas"));
        servicios.add(new RutaGastronomica("RG002", "Ruta del Kuchen", "Puerto Octay", 2, 15000, "Reposteria artesanal", 3));
        servicios.add(new PaseoLacustre("PL002", "Atardecer en el Lago", "Puerto Varas", 3, 30000, "Lago Llanquihue", true));
    }

    public List<ServicioTuristico> getServicios() {
        return servicios;
    }

    public void mostrarServicios() {
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}
