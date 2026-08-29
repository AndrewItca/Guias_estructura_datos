import java.text.DecimalFormat;
import java.util.Scanner;

public class S4_ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#,##0.00");

        try {

            System.out.println("=======================================");
            System.out.println(" CALCULADORA DE IMPUESTO SOBRE LA RENTA");
            System.out.println("=======================================");

            System.out.print("Ingrese su salario anual: ");

            String entrada = scanner.nextLine();

            double salario = Double.parseDouble(entrada);

            validarSalario(salario);

            double porcentajeImpuesto = obtenerTasaImpuesto(salario);
            double impuesto = salario * porcentajeImpuesto;
            double salarioNeto = salario - impuesto;

            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Salario anual: $" + formato.format(salario));
            System.out.println("Tasa aplicada: " + (porcentajeImpuesto * 100) + "%");
            System.out.println("Impuesto a pagar: $" + formato.format(impuesto));
            System.out.println("Salario despues de impuestos: $" + formato.format(salarioNeto));

        } catch (NumberFormatException e) {

            System.out.println("ERROR: Debe ingresar un valor numérico válido.");

        } catch (IllegalArgumentException e) {

            System.out.println("ERROR: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERROR INESPERADO: " + e.getMessage());

        } finally {

            scanner.close();
            System.out.println("\nPrograma finalizado.");
        }
    }

    /**
     * Valida que el salario sea mayor que cero.
     */
    private static void validarSalario(double salario) {

        if (salario <= 0) {
            throw new IllegalArgumentException(
                    "El salario anual debe ser mayor que cero.");
        }
    }

    /**
     * Tabla de impuestos.
     */
    private static double obtenerTasaImpuesto(double salario) {

        if (salario <= 10000) {
            return 0.10; // 10%
        } else if (salario <= 30000) {
            return 0.15; // 15%
        } else if (salario <= 60000) {
            return 0.20; // 20%
        } else {
            return 0.25; // 25%
        }
    }
}