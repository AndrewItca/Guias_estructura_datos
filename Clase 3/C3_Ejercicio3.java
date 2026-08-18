import java.util.Scanner;

// Clase de modelo para encapsular la información del empleado
class Empleado {
    private String nombre;
    private String cargo;
    private double sueldo;

    public Empleado(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // Método para imprimir la información formateada
    public void mostrarInformacion() {
        System.out.printf("Nombre: %-15s | Cargo: %-15s | Sueldo: $%.2f%n", nombre, cargo, sueldo);
    }
}

public class C3_Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];

        System.out.println("=== Registro de Empleados ===");

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("\nEmpleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Sueldo: ");
            double sueldo = scanner.nextDouble();
            
            // Limpieza del búfer de lectura después de leer un número
            scanner.nextLine();

            // Instanciamos el objeto en la posición del array
            empleados[i] = new Empleado(nombre, cargo, sueldo);
        }

        System.out.println("\n=== Listado de Empleados Registrados ===");
        for (Empleado emp : empleados) {
            emp.mostrarInformacion();
        }

        scanner.close();
    }
}