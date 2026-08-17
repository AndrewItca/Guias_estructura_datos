import java.util.Scanner;

public class Ejercicio8 {

    // Clase para representar el punto en el plano cartesiano
    static class Punto {
        private double x;
        private double y;

        public Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public String determinarUbicacion() {
            if (x == 0 && y == 0) {
                return "El punto está en el Origen (0, 0).";
            } else if (x == 0) {
                return "El punto está sobre el Eje Y.";
            } else if (y == 0) {
                return "El punto está sobre el Eje X.";
            } else if (x > 0 && y > 0) {
                return "El punto se encuentra en el Cuadrante I.";
            } else if (x < 0 && y > 0) {
                return "El punto se encuentra en el Cuadrante II.";
            } else if (x < 0 && y < 0) {
                return "El punto se encuentra en el Cuadrante III.";
            } else {
                return "El punto se encuentra en el Cuadrante IV.";
            }
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Ubicación en el Plano Cartesiano ===");

        System.out.print("Ingrese la coordenada X: ");
        double x = scanner.nextDouble();

        System.out.print("Ingrese la coordenada Y: ");
        double y = scanner.nextDouble();

        Punto punto = new Punto(x, y);

        System.out.println("\n--- Resultado ---");
        System.out.printf("Coordenadas: (%.2f, %.2f)%n", punto.getX(), punto.getY());
        System.out.println(punto.determinarUbicacion());

        scanner.close();
    }
}