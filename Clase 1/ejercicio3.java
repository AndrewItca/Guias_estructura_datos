import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CÁLCULO DEL VOLUMEN DE UN CUBO ===");
        System.out.print("Ingresa la longitud del lado del cubo (cm, m, etc.): ");
        double lado = scanner.nextDouble();

        // Opción 1: Usando la clase Math (Math.pow eleva a una potencia)
        double volumen = Math.pow(lado, 3);

        // Opción 2 equivalente: double volumen = lado * lado * lado;

        // Mostrar el resultado
        System.out.printf("\nEl volumen del cubo es: %.2f unidades cúbicas\n", volumen);

        scanner.close();
    }
}