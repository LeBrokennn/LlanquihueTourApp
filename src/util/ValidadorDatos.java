package util;

public class ValidadorDatos {
    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean emailValido(String email) {
        return textoValido(email) && email.contains("@") && email.contains(".");
    }

    public static String limpiarCampo(String campo) {
        if (campo == null) {
            return "";
        }
        return campo.trim();
    }

    public static String obtenerCampo(String[] datos, int posicion) {
        if (datos == null || posicion < 0 || posicion >= datos.length) {
            return "";
        }
        return limpiarCampo(datos[posicion]);
    }
}
