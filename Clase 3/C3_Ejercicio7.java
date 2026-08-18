import java.util.Scanner;

public class C3_Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE INVENTARIO DE PRODUCTOS ===");
        System.out.print("Ingrese la cantidad de productos a registrar: ");
        int filas = 0;

        // Validación de cantidad de productos
        while (filas <= 0) {
            if (scanner.hasNextInt()) {
                filas = scanner.nextInt();
                if (filas <= 0) {
                    System.out.print("La cantidad debe ser mayor a 0. Intente nuevamente: ");
                }
            } else {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                scanner.next();
                System.out.print("Cantidad de productos: ");
            }
        }
        scanner.nextLine(); // Limpieza de búfer

        // Arreglo Bidimensional: N filas x 3 columnas [Nombre, Precio, Cantidad]
        String[][] inventario = new String[filas][3];

        System.out.println("\n--- Registro de Productos ---");
        for (int i = 0; i < filas; i++) {
            System.out.println("\nProducto " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine().trim();
            while (nombre.isEmpty()) {
                System.out.print("El nombre no puede estar vacío. Ingrese el nombre: ");
                nombre = scanner.nextLine().trim();
            }
            inventario[i][0] = nombre;

            // Lectura y validación de Precio
            double precio = -1;
            while (precio < 0) {
                System.out.print("Precio unitario ($): ");
                if (scanner.hasNextDouble()) {
                    precio = scanner.nextDouble();
                    if (precio < 0) {
                        System.out.println("El precio no puede ser negativo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Ingrese un precio numérico.");
                    scanner.next();
                }
            }
            inventario[i][1] = String.valueOf(precio);

            // Lectura y validación de Cantidad
            int cantidad = -1;
            while (cantidad < 0) {
                System.out.print("Cantidad disponible: ");
                if (scanner.hasNextInt()) {
                    cantidad = scanner.nextInt();
                    if (cantidad < 0) {
                        System.out.println("La cantidad no puede ser negativa.");
                    }
                } else {
                    System.out.println("Entrada inválida. Ingrese un número entero.");
                    scanner.next();
                }
            }
            scanner.nextLine(); // Limpieza de búfer
            inventario[i][2] = String.valueOf(cantidad);
        }

        // Despliegue del Inventario y Cálculo del Valor Total
        mostrarInventario(inventario);

        scanner.close();
    }

    private static void mostrarInventario(String[][] matriz) {
        System.out.println("\n============================================================");
        System.out.println("                    INVENTARIO GENERAL                      ");
        System.out.println("============================================================");
        System.out.printf("%-5s | %-20s | %-12s | %-10s | %-12s%n", 
                          "ID", "PRODUCTO", "PRECIO UNIT.", "CANTIDAD", "SUBTOTAL");
        System.out.println("------------------------------------------------------------");

        double valorTotalInventario = 0.0;

        for (int i = 0; i < matriz.length; i++) {
            String nombre = matriz[i][0];
            // Conversión explícita de String a tipos primitivos numéricos
            double precio = Double.parseDouble(matriz[i][1]);
            int cantidad = Integer.parseInt(matriz[i][2]);

            double subtotal = precio * cantidad;
            valorTotalInventario += subtotal;

            System.out.printf("%-5d | %-20s | $%-11.2f | %-10d | $%-11.2f%n", 
                              (i + 1), nombre, precio, cantidad, subtotal);
        }

        System.out.println("============================================================");
        System.out.printf("VALOR TOTAL DEL INVENTARIO: $%.2f%n", valorTotalInventario);
        System.out.println("============================================================");
    }
}