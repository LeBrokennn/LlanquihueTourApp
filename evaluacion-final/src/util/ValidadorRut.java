package util;

public class ValidadorRut {

    public static boolean validar(String rut) {

        if (rut == null || rut.trim().isEmpty()) {
            return false;
        }

        rut = rut.replace(".", "")
                .replace("-", "")
                .trim()
                .toUpperCase();

        if (rut.length() < 2) {
            return false;
        }

        String cuerpo = rut.substring(0, rut.length() - 1);
        char digitoVerificadorIngresado = rut.charAt(rut.length() - 1);

        if (!cuerpo.matches("\\d+")) {
            return false;
        }

        int suma = 0;
        int multiplicador = 2;

        for (int i = cuerpo.length() - 1; i >= 0; i--) {
            suma += Character.getNumericValue(cuerpo.charAt(i))
                    * multiplicador;

            multiplicador++;

            if (multiplicador == 8) {
                multiplicador = 2;
            }
        }

        int resto = 11 - (suma % 11);
        char digitoVerificadorCalculado;

        if (resto == 11) {
            digitoVerificadorCalculado = '0';
        } else if (resto == 10) {
            digitoVerificadorCalculado = 'K';
        } else {
            digitoVerificadorCalculado =
                    Character.forDigit(resto, 10);
        }

        return digitoVerificadorIngresado
                == digitoVerificadorCalculado;
    }
}