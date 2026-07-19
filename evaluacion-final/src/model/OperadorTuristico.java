package model;

public class OperadorTuristico extends PersonaTuristica {

    private String tipoTransporte;
    private int capacidadPersonas;

    public OperadorTuristico(
            String rut,
            String nombre,
            String telefono,
            String correo,
            Direccion direccion,
            String tipoTransporte,
            int capacidadPersonas
    ) {
        super(rut, nombrGit → Commite, telefono, correo, direccion);
        this.tipoTransporte = tipoTransporte;
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    @Override
    public String obtenerTipo() {
        return "Operador turístico";
    }

    @Override
    public void registrar() {
        System.out.println(
                "Operador turístico registrado correctamente: " + getNombre()
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
                + ", tipo de transporte: " + tipoTransporte
                + ", capacidad de personas: " + capacidadPersonas;
    }
}