package model;

public class PaseoLacustre extends ServicioTuristico {
    private String nombreLago;
    private boolean incluyeChalecoSalvavidas;

    public PaseoLacustre(String codigo, String nombre, String ubicacion, int duracionHoras, double precio, String nombreLago, boolean incluyeChalecoSalvavidas) {
        super(codigo, nombre, ubicacion, duracionHoras, precio);
        this.nombreLago = nombreLago;
        this.incluyeChalecoSalvavidas = incluyeChalecoSalvavidas;
    }

    public String getNombreLago() {
        return nombreLago;
    }

    public void setNombreLago(String nombreLago) {
        this.nombreLago = nombreLago;
    }

    public boolean isIncluyeChalecoSalvavidas() {
        return incluyeChalecoSalvavidas;
    }

    public void setIncluyeChalecoSalvavidas(boolean incluyeChalecoSalvavidas) {
        this.incluyeChalecoSalvavidas = incluyeChalecoSalvavidas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Paseo Lacustre ===");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Duracion: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
        System.out.println("Lago: " + nombreLago);
        System.out.println("Incluye chaleco salvavidas: " + (incluyeChalecoSalvavidas ? "Si" : "No"));
        System.out.println();
    }
}
