import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes para los porcentajes
        final double PORCENTAJE_P1 = 0.20;
        final double PORCENTAJE_P2 = 0.25;
        final double PORCENTAJE_P3 = 0.40;
        final double PORCENTAJE_TAREA = 0.15;

        System.out.println("=== CÁLCULO DE NOTA FINAL DE CICLO ===");

        // Lectura de notas
        System.out.print("Ingrese la nota del Parcial 1 (20%): ");
        double parcial1 = scanner.nextDouble();

        System.out.print("Ingrese la nota del Parcial 2 (25%): ");
        double parcial2 = scanner.nextDouble();

        System.out.print("Ingrese la nota del Parcial 3 (40%): ");
        double parcial3 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la Tarea (15%): ");
        double tarea = scanner.nextDouble();

        // Cálculo de la nota final ponderada
        double notaFinal = (parcial1 * PORCENTAJE_P1) 
                         + (parcial2 * PORCENTAJE_P2) 
                         + (parcial3 * PORCENTAJE_P3) 
                         + (tarea * PORCENTAJE_TAREA);

        // Mostrar resultados
        System.out.println("\n=== RESULTADO ===");
        System.out.printf("La nota final del ciclo es: %.2f\n", notaFinal);

        // Opcional: Validación de aprobación
        if (notaFinal >= 6.0) {
            System.out.println("Estado: ¡Aprobado!");
        } else {
            System.out.println("Estado: Reprobado.");
        }

        scanner.close();
    }
}