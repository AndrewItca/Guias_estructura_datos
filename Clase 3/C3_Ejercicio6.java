import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Modelo para representar cada gasto individual
class Gasto {
    private String descripcion;
    private double monto;

    public Gasto(String descripcion, double monto) {
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return String.format("%-25s : $%.2f", descripcion, monto);
    }
}

public class C3_Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Gasto> listaGastos = new ArrayList<>();
        String opcion;

        System.out.println("=== REGISTRO DE GASTOS MENSUALES ===");

        do {
            System.out.print("\nIngrese la descripción del gasto: ");
            String descripcion = scanner.nextLine().trim();

            // Validación de campo obligatorio para la descripción
            while (descripcion.isEmpty()) {
                System.out.print("La descripción no puede estar vacía. Ingrese una descripción válida: ");
                descripcion = scanner.nextLine().trim();
            }

            double monto = 0.0;
            boolean montoValido = false;

            // Validación de entrada para el monto
            while (!montoValido) {
                System.out.print("Ingrese el monto de '" + descripcion + "': $");
                if (scanner.hasNextDouble()) {
                    monto = scanner.nextDouble();
                    if (monto > 0) {
                        montoValido = true;
                    } else {
                        System.out.println("Error: El monto debe ser mayor a 0.");
                    }
                } else {
                    System.out.println("Error: Ingrese un valor numérico válido.");
                    scanner.next(); // Limpiar la entrada incorrecta
                }
            }
            scanner.nextLine(); // Limpieza del búfer de lectura

            // Se añade el gasto a la lista dinámica
            listaGastos.add(new Gasto(descripcion, monto));

            System.out.print("¿Desea registrar otro gasto? (s/n): ");
            opcion = scanner.nextLine().trim().toLowerCase();

        } while (opcion.equals("s") || opcion.equals("si"));

        // Reporte final de gastos
        mostrarReporteGastos(listaGastos);

        scanner.close();
    }

    private static void mostrarReporteGastos(List<Gasto> gastos) {
        System.out.println("\n==========================================");
        System.out.println("        RESUMEN DE GASTOS DEL MES         ");
        System.out.println("==========================================");

        if (gastos.isEmpty()) {
            System.out.println("No se registraron gastos para este periodo.");
            return;
        }

        double totalGastado = 0.0;
        for (int i = 0; i < gastos.size(); i++) {
            Gasto gasto = gastos.get(i);
            System.out.println((i + 1) + ". " + gasto);
            totalGastado += gasto.getMonto();
        }

        System.out.println("------------------------------------------");
        System.out.printf("TOTAL GASTADO         : $%.2f%n", totalGastado);
        System.out.println("==========================================");
    }
}