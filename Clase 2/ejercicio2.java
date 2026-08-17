import java.util.Scanner;

public class ejercicio2 {

    // Clase Rectangulo
    static class Rectangulo {
        private double base;
        private double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            return this.base * this.altura;
        }

        public double getBase() {
            return base;
        }

        public double getAltura() {
            return altura;
        }
    }

    public static void main(String[] args) {
        // Objeto Scanner para lectura de datos desde la consola
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cálculo del Área de un Rectángulo ===");
        
        // Solicitud de datos al usuario
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Instancia de la clase y cálculo del área
        Rectangulo rectangulo = new Rectangulo(base, altura);
        double area = rectangulo.calcularArea();

        // Impresión de resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("El área del rectángulo es: " + area);

        // Cierre del recurso
        scanner.close();
    }
}