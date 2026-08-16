import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE PROMEDIO DE NOTAS ===");

        // Pedir las 3 notas
        System.out.print("Ingresa la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingresa la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingresa la tercera nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular el promedio
        // Nota: Los paréntesis son obligatorios para que la suma se realice antes de la división
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Mostrar el resultado con formato
        System.out.printf("\nEl promedio final es: %.2f\n", promedio);

        // Estructura condicional básica para saber si aprobó
        if (promedio >= 6.0) {
            System.out.println("Estado: ¡Aprobado!");
        } else {
            System.out.println("Estado: Reprobado.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}