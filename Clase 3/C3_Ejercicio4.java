import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Modelo que representa un producto individual
class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return String.format("%-20s : $%.2f", nombre, precio);
    }
}

public class C3_Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> listaCompras = new ArrayList<>();
        String opcion;

        System.out.println("=== SISTEMA DE REGISTRO DE COMPRAS ===");

        // Bucle de registro interactivo
        do {
            System.out.print("\nIngrese el nombre del producto: ");
            String nombre = scanner.nextLine().trim();

            double precio = 0.0;
            boolean precioValido = false;

            // Validación básica para evitar valores erróneos en el precio
            while (!precioValido) {
                System.out.print("Ingrese el precio de " + nombre + ": $");
                if (scanner.hasNextDouble()) {
                    precio = scanner.nextDouble();
                    if (precio >= 0) {
                        precioValido = true;
                    } else {
                        System.out.println("El precio no puede ser negativo. Intente nuevamente.");
                    }
                } else {
                    System.out.println("Entrada inválida. Ingrese un número válido.");
                    scanner.next(); // Limpiar entrada incorrecta
                }
            }
            scanner.nextLine(); // Limpieza de búfer

            // Agregamos el producto dinámicamente a la lista
            listaCompras.add(new Producto(nombre, precio));

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            opcion = scanner.nextLine().trim().toLowerCase();

        } while (opcion.equals("s") || opcion.equals("si"));

        // Mostrar resumen y cálculo del total
        imprimirResumenCompra(listaCompras);

        scanner.close();
    }

    private static void imprimirResumenCompra(List<Producto> lista) {
        System.out.println("\n========================================");
        System.out.println("          RESUMEN DE LA COMPRA          ");
        System.out.println("========================================");

        if (lista.isEmpty()) {
            System.out.println("No se registraron productos.");
            return;
        }

        double total = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            Producto prod = lista.get(i);
            System.out.println((i + 1) + ". " + prod);
            total += prod.getPrecio();
        }

        System.out.println("----------------------------------------");
        System.out.printf("TOTAL A PAGAR         : $%.2f%n", total);
        System.out.println("========================================");
    }
}