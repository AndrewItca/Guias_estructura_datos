import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE ÁREA Y DIÁMETRO DE UNA CIRCUNFERENCIA ===");
        System.out.print("Ingresa el valor del radio: ");
        double radio = scanner.nextDouble();

        // 1. Cálculo del diámetro (d = 2 * r)
        double diametro = 2 * radio;

        // 2. Cálculo del área (A = PI * r^2)
        // Usamos Math.PI para obtener el valor preciso de Pi y Math.pow para elevar al cuadrado
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Diámetro: %.2f\n", diametro);
        System.out.printf("Área: %.2f unidades cuadradas\n", area);

        scanner.close();
    }
}