import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double TASA_IVA = 0.13;

        // 1. Solicitud de datos
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // 2. Cálculos
        double iva = precio * TASA_IVA;
        double total = precio + iva;

        // 3. Salida concatenada (según formato de la guía)
        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Nombre del producto: %s, Precio: $%.2f, IVA: $%.2f, Total: $%.2f\n", 
                          nombreProducto, precio, iva, total);

        scanner.close();
    }
}