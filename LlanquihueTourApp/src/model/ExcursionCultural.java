package model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;
    private String guiaAsignado;

    public ExcursionCultural(String codigo, String nombre, String ubicacion, int duracionHoras, double precio, String lugarHistorico, String guiaAsignado) {
        super(codigo, nombre, ubicacion, duracionHoras, precio);
        this.lugarHistorico = lugarHistorico;
        this.guiaAsignado = guiaAsignado;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    public String getGuiaAsignado() {
        return guiaAsignado;
    }

    public void setGuiaAsignado(String guiaAsignado) {
        this.guiaAsignado = guiaAsignado;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Excursion Cultural ===");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Duracion: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
        System.out.println("Lugar historico: " + lugarHistorico);
        System.out.println("Guia asignado: " + guiaAsignado);
        System.out.println();
    }
}
