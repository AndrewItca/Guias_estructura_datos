import java.util.Scanner;

public class C3_Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("--- Lectura de Datos ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializamos max y min con el primer elemento del arreglo
        int maximo = numeros[0];
        int posicionMax = 0;

        int minimo = numeros[0];
        int posicionMin = 0;

        // Recorremos el arreglo a partir del segundo elemento
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
                posicionMax = i;
            }

            if (numeros[i] < minimo) {
                minimo = numeros[i];
                posicionMin = i;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Valor máximo: " + maximo + " (Posición o índice: " + posicionMax + ")");
        System.out.println("Valor mínimo: " + minimo + " (Posición o índice: " + posicionMin + ")");

        scanner.close();
    }
}