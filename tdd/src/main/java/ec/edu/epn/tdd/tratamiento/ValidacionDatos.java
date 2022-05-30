package ec.edu.epn.tdd.tratamiento;

public class ValidacionDatos {
    public ValidacionDatos() {
    }

    public static boolean validarCedula(String cedula) {
        return cedula.matches("[0-9]{10}");
    }

    public static boolean validarNombresApellidos(String nombres) {
        return nombres.matches("[A-Za-z\\s]*");
    }

    public static boolean validarEdad(String edad) {
        return edad.matches("[0-9]*");
    }

    public static boolean validarGenero(String genero) {
        return genero.matches("[M|F]");
    }

    public static boolean validarFecha(String fecha) {
        return fecha.matches("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})");
    }

    public static boolean validarTelefono(String telefono) {
        return telefono.matches("[0-9]{10}");
    }

    public static boolean validarTipoSangre(String sangre) {
        return sangre.matches("[A|B|AB|O]+[\\+|\\-]{1,1}");
    }
}
