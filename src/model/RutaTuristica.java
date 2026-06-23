package model;

public class RutaTuristica {
    private String codigo;
    private String nombre;
    private String categoria;
    private String comunaBase;

    public RutaTuristica() {
        this.codigo = "Sin código";
        this.nombre = "Sin nombre";
        this.categoria = "Sin categoría";
        this.comunaBase = "Sin comuna";
    }

    public RutaTuristica(String codigo, String nombre, String categoria, String comunaBase) {
        setCodigo(codigo);
        setNombre(nombre);
        setCategoria(categoria);
        setComunaBase(comunaBase);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de la ruta no puede estar vacío.");
        }
        this.codigo = codigo.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la ruta no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.trim().isEmpty()) {
            this.categoria = "General";
        } else {
            this.categoria = categoria.trim();
        }
    }

    public String getComunaBase() {
        return comunaBase;
    }

    public void setComunaBase(String comunaBase) {
        if (comunaBase == null || comunaBase.trim().isEmpty()) {
            this.comunaBase = "Sin comuna";
        } else {
            this.comunaBase = comunaBase.trim();
        }
    }

    @Override
    public String toString() {
        return "Ruta: " + codigo
                + " | Nombre: " + nombre
                + " | Categoría: " + categoria
                + " | Comuna base: " + comunaBase;
    }
}
