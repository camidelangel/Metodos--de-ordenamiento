package Metodos_de_ordenamiento;
import java.util.Arrays;
/*Clase principal del programa.
 * Permite ejecutar y comprobar el funcionamiento
 * de los algoritmos QuickSort y ShellSort.
 */
public class Main {
    public static void main(String[] args) {

        // Arreglo inicial que se utilizara en las pruebas.
        int[] arregloOriginal = {60, 11, 52, 83, 34, 25, 76, 47};

        // Creamos una copia para QuickSort.
        int[] arregloQuickSort = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        // Creamos otra copia para ShellSort.
        int[] arregloShellSort = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        // Ejecutamos QuickSort.
        System.out.println("===== ALGORITMO QUICKSORT =====");

        System.out.print("Arreglo original: ");
        QuickSort.imprimirArreglo(arregloQuickSort);

        QuickSort.ordenar(arregloQuickSort);

        System.out.print("Arreglo ordenado: ");
        QuickSort.imprimirArreglo(arregloQuickSort);

        // Ejecutamos ShellSort.
        System.out.println();

        System.out.println("===== ALGORITMO SHELLSORT =====");

        System.out.print("Arreglo original: ");
        ShellSort.imprimirArreglo(arregloShellSort);

        ShellSort.ordenar(arregloShellSort);

        System.out.print("Arreglo ordenado: ");
        ShellSort.imprimirArreglo(arregloShellSort);
    }
}
