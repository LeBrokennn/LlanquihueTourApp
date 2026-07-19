package model;

public class ProveedorAlojamiento extends PersonaTuristica {

    private String nombreAlojamiento;
    private int cantidadHabitaciones;

    public ProveedorAlojamiento(
            String rut,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            String nombreAlojamiento,
            int cantidadHabitaciones
    ) {
        super(rut, nombre, telefono, correo, direccion);
        this.nombreAlojamiento = nombreAlojamiento;
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    @Override
    public String obtenerTipo() {
        return "Proveedor de alojamiento";
    }

    @Override
    public void registrar() {
        System.out.println(
                "Proveedor de alojamiento registrado correctamente: "
                        + getNombre()
        );
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tipo: " + obtenerTipo()
                + ", " + super.toString()
                + ", alojamiento: " + nombreAlojamiento
                + ", cantidad de habitaciones: " + cantidadHabitaciones;
    }
}