import java.util.Arrays;
import java.util.Scanner;

public class C3_Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CALIFICACIONES DE ESTUDIANTES ===");
        System.out.print("Ingrese la cantidad de estudiantes a registrar: ");
        int cantidad = 0;

        // Validación para asegurar un tamaño de arreglo válido
        while (cantidad <= 0) {
            if (scanner.hasNextInt()) {
                cantidad = scanner.nextInt();
                if (cantidad <= 0) {
                    System.out.print("La cantidad debe ser mayor a 0. Intente nuevamente: ");
                }
            } else {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                scanner.next();
                System.out.print("Cantidad de estudiantes: ");
            }
        }

        double[] calificaciones = new double[cantidad];
        double suma = 0.0;

        System.out.println("\n--- Ingreso de Calificaciones (Escala 0 a 100) ---");
        for (int i = 0; i < calificaciones.length; i++) {
            boolean notaValida = false;
            while (!notaValida) {
                System.out.print("Calificación del estudiante " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    double nota = scanner.nextDouble();
                    if (nota >= 0 && nota <= 100) {
                        calificaciones[i] = nota;
                        suma += nota;
                        notaValida = true;
                    } else {
                        System.out.println("Error: La calificación debe estar entre 0 y 100.");
                    }
                } else {
                    System.out.println("Error: Ingrese un valor numérico válido.");
                    scanner.next(); // Limpiar entrada incorrecta
                }
            }
        }

        // Lógica de cálculo de máximo, mínimo y promedio
        double maximo = calificaciones[0];
        double minimo = calificaciones[0];

        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > maximo) {
                maximo = calificaciones[i];
            }
            if (calificaciones[i] < minimo) {
                minimo = calificaciones[i];
            }
        }

        double promedio = suma / calificaciones.length;

        // Despliegue de Resultados
        System.out.println("\n========================================");
        System.out.println("         RESULTADOS ACADÉMICOS          ");
        System.out.println("========================================");
        System.out.println("Notas registradas : " + Arrays.toString(calificaciones));
        System.out.printf("Promedio general  : %.2f%n", promedio);
        System.out.printf("Calificación alta : %.2f%n", maximo);
        System.out.printf("Calificación baja : %.2f%n", minimo);
        System.out.println("========================================");

        scanner.close();
    }
}