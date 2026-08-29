import java.util.InputMismatchException;
import java.util.Scanner;

public class S4_ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("==================================");
            System.out.println("     CALCULO DE RAIZ CUADRADA");
            System.out.println("==================================");

            System.out.print("Ingrese un numero: ");

            double numero = scanner.nextDouble();

            validarNumero(numero);

            double raiz = Math.sqrt(numero);

            System.out.println("----------------------------------");
            System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
            System.out.println("----------------------------------");

        } catch (InputMismatchException e) {

            System.out.println("ERROR: Debe ingresar un numero valido.");

        } catch (ArithmeticException e) {

            System.out.println("ERROR: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("ERROR INESPERADO: " + e.getMessage());

        } finally {

            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }

    private static void validarNumero(double numero) {

        if (numero < 0) {
            throw new ArithmeticException(
                    "No se puede calcular la raiz cuadrada de numeros negativos.");
        }
    }
}