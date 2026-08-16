import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Porcentajes de evaluación
        final double PORCENTAJE_PARCIALES = 0.55;
        final double PORCENTAJE_EXAMEN_FINAL = 0.30;
        final double PORCENTAJE_TRABAJO = 0.15;

        System.out.println("=== CALIFICACIÓN FINAL - LÓGICA COMPUTACIONAL ===");

        // 1. Entrada de notas parciales y promedio
        System.out.print("Ingrese la nota del Parcial 1: ");
        double p1 = scanner.nextDouble();

        System.out.print("Ingrese la nota del Parcial 2: ");
        double p2 = scanner.nextDouble();

        System.out.print("Ingrese la nota del Parcial 3: ");
        double p3 = scanner.nextDouble();

        double promedioParciales = (p1 + p2 + p3) / 3.0;

        // 2. Entrada de examen final y trabajo ex-aula
        System.out.print("Ingrese la nota del Examen Final: ");
        double examenFinal = scanner.nextDouble();

        System.out.print("Ingrese la nota del Trabajo Ex-Aula: ");
        double trabajoExAula = scanner.nextDouble();

        // 3. Cálculo de la nota 1, nota 2, nota 3 y total final
        double nota1 = promedioParciales * PORCENTAJE_PARCIALES;
        double nota2 = examenFinal * PORCENTAJE_EXAMEN_FINAL;
        double nota3 = trabajoExAula * PORCENTAJE_TRABAJO;

        double calificacionFinal = nota1 + nota2 + nota3;

        // Mostrar resultados
        System.out.println("\n=== DESGLOSE DE NOTAS ===");
        System.out.printf("Promedio de Parciales: %.2f (Aporta: %.2f pts)\n", promedioParciales, nota1);
        System.out.printf("Examen Final:          %.2f (Aporta: %.2f pts)\n", examenFinal, nota2);
        System.out.printf("Trabajo Ex-Aula:       %.2f (Aporta: %.2f pts)\n", trabajoExAula, nota3);
        System.out.println("----------------------------------------");
        System.out.printf("Calificación Final:    %.2f\n", calificacionFinal);

        scanner.close();
    }
}