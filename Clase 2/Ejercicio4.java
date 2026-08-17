import java.util.Scanner;

public class Ejercicio4 {

    // Clase Empleado que maneja la lógica de retención de Renta
    static class Empleado {
        private double sueldoBase;

        public Empleado(double sueldoBase) {
            this.sueldoBase = sueldoBase;
        }

        public double calcularRenta() {
            // Tabla de retención de Renta mensual (El Salvador)
            // Tramo I: $0.01 a $472.00 (Exento)
            if (sueldoBase <= 472.00) {
                return 0.0;
            } 
            // Tramo II: $472.01 a $895.24 (10% sobre el exceso de $472 + cuota fija $17.67)
            else if (sueldoBase <= 895.24) {
                return ((sueldoBase - 472.00) * 0.10) + 17.67;
            } 
            // Tramo III: $895.25 a $2,038.10 (20% sobre el exceso de $895.24 + cuota fija $60.00)
            else if (sueldoBase <= 2038.10) {
                return ((sueldoBase - 895.24) * 0.20) + 60.00;
            } 
            // Tramo IV: $2,038.11 en adelante (30% sobre el exceso de $2,038.10 + cuota fija $288.57)
            else {
                return ((sueldoBase - 2038.10) * 0.30) + 288.57;
            }
        }

        public double calcularSueldoNeto() {
            return sueldoBase - calcularRenta();
        }

        public double getSueldoBase() {
            return sueldoBase;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cálculo de Descuento de Renta ===");
        System.out.print("Ingrese el sueldo mensual del empleado ($): ");
        double sueldo = scanner.nextDouble();

        Empleado empleado = new Empleado(sueldo);
        double descuentoRenta = empleado.calcularRenta();
        double sueldoNeto = empleado.calcularSueldoNeto();

        System.out.println("\n--- Resumen de Pago ---");
        System.out.printf("Sueldo Base: $%.2f%n", empleado.getSueldoBase());

        if (descuentoRenta > 0) {
            System.out.printf("Descuento de Renta: $%.2f%n", descuentoRenta);
        } else {
            System.out.println("Descuento de Renta: $0.00 (Exento)");
        }

        System.out.printf("Sueldo Neto a Recibir: $%.2f%n", sueldoNeto);

        scanner.close();
    }
}