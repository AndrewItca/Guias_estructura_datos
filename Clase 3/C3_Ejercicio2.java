import java.util.Arrays;
import java.util.Collections;

public class C3_Ejercicio2 {

    public static void main(String[] args) {
        // Array original para ordenamiento de menor a mayor
        int[] numerosAsc = {1, 5, 8, 9, 2, 3, 1};

        System.out.println("Array original: " + Arrays.toString(numerosAsc));

        // 1. Orden de menor a mayor (Ascendente)
        Arrays.sort(numerosAsc);
        System.out.println("\n--- Menor a Mayor ---");
        System.out.println(Arrays.toString(numerosAsc));

        // 2. Orden de mayor a menor (Descendente)
        // Para usar Collections.reverseOrder() necesitamos un arreglo de Objetos (Integer[])
        Integer[] numerosDesc = {1, 5, 8, 9, 2, 3, 1};
        Arrays.sort(numerosDesc, Collections.reverseOrder());

        System.out.println("\n--- Mayor a Menor ---");
        System.out.println(Arrays.toString(numerosDesc));
    }
}