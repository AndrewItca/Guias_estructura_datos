import java.util.Scanner;

public class Ejercicio9 {

    // Clase para la venta de entradas
    static class Boleto {
        private int edad;
        private double precioBase;

        public Boleto(int edad, double precioBase) {
            this.edad = edad;
            this.precioBase = precioBase;
        }

        public boolean aplicaDescuento() {
            // Aplica 50% de descuento si es menor de 18 o mayor de 60 años
            return edad < 18 || edad > 60;
        }

        public double calcularPrecioFinal() {
            if (aplicaDescuento()) {
                return precioBase * 0.50; // Aplica el 50%
            }
            return precioBase;
        }

        public int getEdad() {
            return edad;
        }

        public double getPrecioBase() {
            return precioBase;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Boletos de Cine ===");

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el precio base del boleto ($): ");
        double precioBase = scanner.nextDouble();

        Boleto boleto = new Boleto(edad, precioBase);
        double precioFinal = boleto.calcularPrecioFinal();

        System.out.println("\n--- Detalle del Cobro ---");
        System.out.println("Edad del cliente: " + boleto.getEdad() + " años");
        System.out.printf("Precio regular: $%.2f%n", boleto.getPrecioBase());

        if (boleto.aplicaDescuento()) {
            System.out.println("Descuento aplicado: 50%");
        } else {
            System.out.println("Descuento aplicado: 0% (Tarifa regular)");
        }

        System.out.printf("Monto total a pagar: $%.2f%n", precioFinal);

        scanner.close();
    }
}