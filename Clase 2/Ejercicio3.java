import java.util.Scanner;

public class Ejercicio3 {

    // Clase TrianguloRectangulo
    static class TrianguloRectangulo {
        private double catetoA;
        private double catetoB;

        public TrianguloRectangulo(double catetoA, double catetoB) {
            this.catetoA = catetoA;
            this.catetoB = catetoB;
        }

        public double calcularHipotenusa() {
            // Teorema de Pitágoras: h = √(a² + b²)
            // Math.pow(a, 2) calcula la potencia al cuadrado
            // Math.sqrt(x) calcula la raíz cuadrada
            return Math.sqrt(Math.pow(this.catetoA, 2) + Math.pow(this.catetoB, 2));
        }

        public double getCatetoA() {
            return catetoA;
        }

        public double getCatetoB() {
            return catetoB;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cálculo de la Hipotenusa ===");

        System.out.print("Ingrese la longitud del primer cateto (a): ");
        double catetoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo cateto (b): ");
        double catetoB = scanner.nextDouble();

        TrianguloRectangulo triangulo = new TrianguloRectangulo(catetoA, catetoB);
        double hipotenusa = triangulo.calcularHipotenusa();

        System.out.println("\n--- Resultados ---");
        System.out.println("Cateto a: " + triangulo.getCatetoA());
        System.out.println("Cateto b: " + triangulo.getCatetoB());
        System.out.printf("La hipotenusa es: %.2f%n", hipotenusa);

        scanner.close();
    }
}