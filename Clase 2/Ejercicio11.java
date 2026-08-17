import java.util.Scanner;

public class Ejercicio11 {

    // Clase para gestionar el cálculo de sueldo del trabajador
    static class Trabajador {
        private String nombre;
        private double horasTrabajadas;
        private char clasePuesto;

        public Trabajador(String nombre, double horasTrabajadas, char clasePuesto) {
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.clasePuesto = Character.toUpperCase(clasePuesto);
        }

        public double obtenerTarifaHora() {
            switch (clasePuesto) {
                case 'A':
                    return 7.00;
                case 'B':
                    return 8.50;
                case 'C':
                    return 10.00;
                case 'D':
                    return 12.50;
                default:
                    return -1.0; // Indica clase no válida
            }
        }

        public double calcularSueldoSemanal() {
            double tarifa = obtenerTarifaHora();
            if (tarifa < 0) {
                return 0.0;
            }
            return horasTrabajadas * tarifa;
        }

        public String getNombre() {
            return nombre;
        }

        public double getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public char getClasePuesto() {
            return clasePuesto;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cálculo de Sueldo Semanal ===");

        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese las horas trabajadas en la semana: ");
        double horas = scanner.nextDouble();

        System.out.print("Ingrese la clase de puesto (A, B, C, D): ");
        char clase = scanner.next().charAt(0);

        Trabajador trabajador = new Trabajador(nombre, horas, clase);
        double tarifa = trabajador.obtenerTarifaHora();

        if (tarifa < 0) {
            System.err.println("\nError: La clase ingresada no es válida. Use A, B, C o D.");
        } else {
            double sueldoSemanal = trabajador.calcularSueldoSemanal();

            System.out.println("\n--- Resumen del Empleado ---");
            System.out.println("Nombre: " + trabajador.getNombre());
            System.out.println("Clase de Puesto: " + trabajador.getClasePuesto());
            System.out.printf("Tarifa por Hora: $%.2f%n", tarifa);
            System.out.printf("Horas Trabajadas: %.2f hrs%n", trabajador.getHorasTrabajadas());
            System.out.printf("Sueldo Semanal Total: $%.2f%n", sueldoSemanal);
        }

        scanner.close();
    }
}