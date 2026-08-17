public class Ejercicio6 {

    // Método auxiliar para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        // Evaluamos divisores hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limitePrimos = 100;
        int contador = 0;
        int numeroEvaluar = 2;

        System.out.println("=== Los Primeros 100 Números Primos ===");

        while (contador < limitePrimos) {
            if (esPrimo(numeroEvaluar)) {
                contador++;
                // Formateo para mostrar 10 números por fila
                System.out.printf("%4d ", numeroEvaluar);
                if (contador % 10 == 0) {
                    System.out.println();
                }
            }
            numeroEvaluar++;
        }
        
        System.out.println("\nTotal de primos impresos: " + contador);
    }
}