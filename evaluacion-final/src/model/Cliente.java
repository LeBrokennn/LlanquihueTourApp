package model;

public class Cliente extends PersonaTuristica {

    private String preferencias;
    private int cantidadReservas;

    public Cliente(
            String rut,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            String preferencias,
            int cantidadReservas
    ) {
        super(rut, nombre, telefono, correo, direccion);
        this.preferencias = preferencias;
        this.cantidadReservas = cantidadReservas;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public int getCantidadReservas() {
        return cantidadReservas;
    }

    public void setCantidadReservas(int cantidadReservas) {
        this.cantidadReservas = cantidadReservas;
    }

    @Override
    public String obtenerTipo() {
        return "Cliente";
    }

    @Override
    public void registrar() {
        System.out.println("Cliente registrado correctamente: " + getNombre());
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tipo: " + obtenerTipo()
                + ", " + super.toString()
                + ", preferencias: " + preferencias
                + ", cantidad de reservas: " + cantidadReservas;
    }
}