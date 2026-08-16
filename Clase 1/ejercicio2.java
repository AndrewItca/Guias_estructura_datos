import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tasa de cambio de referencia (1 USD = 0.87 EUR)
        final double TASA_CAMBIO = 0.87;

        System.out.println("=== CONVERSOR DE DÓLARES A EUROS ===");
        System.out.print("Ingresa la cantidad en Dólares ($): ");
        double dolares = scanner.nextDouble();

        // Operación de conversión
        double euros = dolares * TASA_CAMBIO;

        // Mostrar el resultado en pantalla
        System.out.printf("\n$%.2f USD equivalen a €%.2f EUR\n", dolares, euros);

        scanner.close();
    }
}