package model;

public class Contacto {
    private String telefono;
    private String email;

    public Contacto() {
        this.telefono = "Sin teléfono";
        this.email = "Sin email";
    }

    public Contacto(String telefono, String email) {
        setTelefono(telefono);
        setEmail(email);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            this.telefono = "Sin teléfono";
        } else {
            this.telefono = telefono.trim();
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            this.email = "Sin email";
        } else {
            this.email = email.trim();
        }
    }

    @Override
    public String toString() {
        return "Teléfono: " + telefono + " | Email: " + email;
    }
}
