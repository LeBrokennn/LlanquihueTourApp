package model;

public class RutaGastronomica extends ServicioTuristico {
    private String especialidad;
    private int cantidadDegustaciones;

    public RutaGastronomica(String codigo, String nombre, String ubicacion, int duracionHoras, double precio, String especialidad, int cantidadDegustaciones) {
        super(codigo, nombre, ubicacion, duracionHoras, precio);
        this.especialidad = especialidad;
        this.cantidadDegustaciones = cantidadDegustaciones;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCantidadDegustaciones() {
        return cantidadDegustaciones;
    }

    public void setCantidadDegustaciones(int cantidadDegustaciones) {
        this.cantidadDegustaciones = cantidadDegustaciones;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Ruta Gastronomica ===");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Duracion: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Degustaciones incluidas: " + cantidadDegustaciones);
        System.out.println();
    }
}
