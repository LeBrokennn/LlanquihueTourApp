package util;

import exception.RutInvalidoException;

public class ValidadorRut {

    public static void validar(String rut) throws RutInvalidoException {

        if (rut == null || rut.isBlank()) {
            throw new RutInvalidoException("El RUT no puede estar vacío.");
        }

        String rutLimpio = rut.replace(".", "").replace("-", "");

        if (rutLimpio.length() < 8 || rutLimpio.length() > 9) {
            throw new RutInvalidoException(
                    "El RUT debe tener entre 8 y 9 caracteres."
            );
        }

        String cuerpo = rutLimpio.substring(0, rutLimpio.length() - 1);
        char digitoVerificador =
                rutLimpio.charAt(rutLimpio.length() - 1);

        if (!cuerpo.matches("\\d+")) {
            throw new RutInvalidoException(
                    "El cuerpo del RUT solo debe contener números."
            );
        }

        if (!Character.isDigit(digitoVerificador)
                && digitoVerificador != 'k'
                && digitoVerificador != 'K') {

            throw new RutInvalidoException(
                    "El dígito verificador del RUT no es válido."
            );
        }
    }

    private ValidadorRut() {
    }
}