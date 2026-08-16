import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tasa del IVA (13%)
        final double TASA_IVA = 0.13;

        System.out.println("=== CÁLCULO DEL IVA (13%) ===");
        System.out.print("Ingresa el precio base del producto ($): ");
        double precioBase = scanner.nextDouble();

        // Operaciones
        double montoIVA = precioBase * TASA_IVA;
        double precioTotal = precioBase + montoIVA;

        // Mostrar resultados en pantalla
        System.out.println("\n--- DESGLOSE DE COMPRA ---");
        System.out.printf("Precio base:  $%.2f\n", precioBase);
        System.out.printf("Monto IVA:    $%.2f\n", montoIVA);
        System.out.printf("Precio Total: $%.2f\n", precioTotal);

        scanner.close();
    }
}