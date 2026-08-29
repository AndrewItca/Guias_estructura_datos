import java.util.Scanner;

public class S4_ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("=================================");
            System.out.println(" REGISTRO DE USUARIO");
            System.out.println("=================================");

            System.out.print("Ingrese nombre de usuario: ");
            String usuario = scanner.nextLine().trim();

            validarUsuario(usuario);

            System.out.print("Ingrese contraseña: ");
            String contrasena = scanner.nextLine();

            validarContrasena(contrasena);

            System.out.println("\n=================================");
            System.out.println("USUARIO REGISTRADO EXITOSAMENTE");
            System.out.println("=================================");
            System.out.println("Usuario: " + usuario);

        } catch (SecurityException e) {

            System.out.println("\nERROR DE SEGURIDAD:");
            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("\nERROR INESPERADO:");
            System.out.println(e.getMessage());

        } finally {

            scanner.close();
            System.out.println("\nPrograma finalizado.");
        }
    }

    /**
     * Valida el nombre de usuario.
     */
    private static void validarUsuario(String usuario) {

        if (usuario == null || usuario.trim().isEmpty()) {
            throw new SecurityException(
                    "El nombre de usuario no puede estar vacío.");
        }

        if (usuario.length() < 4) {
            throw new SecurityException(
                    "El nombre de usuario debe tener al menos 4 caracteres.");
        }
    }

    /**
     * Valida la contraseña según criterios de seguridad.
     */
    private static void validarContrasena(String contrasena) {

        if (contrasena == null || contrasena.trim().isEmpty()) {
            throw new SecurityException(
                    "La contraseña no puede estar vacía.");
        }

        if (contrasena.length() < 8) {
            throw new SecurityException(
                    "La contraseña debe tener al menos 8 caracteres.");
        }

        boolean tieneMayuscula = false;
        boolean tieneNumero = false;
        boolean tieneEspecial = false;

        for (char c : contrasena.toCharArray()) {

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }

            if (Character.isDigit(c)) {
                tieneNumero = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                tieneEspecial = true;
            }
        }

        if (!tieneMayuscula) {
            throw new SecurityException(
                    "La contraseña debe contener al menos una letra mayúscula.");
        }

        if (!tieneNumero) {
            throw new SecurityException(
                    "La contraseña debe contener al menos un número.");
        }

        if (!tieneEspecial) {
            throw new SecurityException(
                    "La contraseña debe contener al menos un carácter especial.");
        }
    }
}