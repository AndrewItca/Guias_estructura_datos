import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        // Crear objeto Scanner para lectura por consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar el radio de la circunferencia
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Calcular el diámetro (diámetro = 2 * radio)
        double diametro = 2 * radio;

        // Calcular el área (área = PI * radio^2)
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar los resultados obtenidos
        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("Diámetro: %.2f\n", diametro);
        System.out.printf("Área:     %.2f\n", area);

        scanner.close();
    }
}