package Metodos_de_ordenamiento;
/* Clase que implementa el algoritmo de ordenamiento ShellSort.
 * Es una optimizacion del ordenamiento por insercion que compara
 * elementos separados por intervalos (gaps) mayores a uno,
 * reduciendolos progresivamente.
 */
public class ShellSort {
    /*Ordena un arreglo de enteros de forma ascendente usando ShellSort.
     * @param arr Arreglo de enteros que se desea ordenar.
     */
    public static void ordenar(int[] arr) {

        int n = arr.length;

        // 1. Reduccion del salto:
        // Empieza en n/2 y se divide entre 2 en cada vuelta hasta ser 0.
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {

            // 2. Recorrido tipo insercion pero saltando
            // segun el intervalo actual.
            for (int i = intervalo; i < n; i++) {

                // Elemento que vamos a acomodar.
                int temp = arr[i];

                int j = i;

                // 3. Desplazamiento de elementos:
                // Comparamos los elementos separados por el intervalo.
                // Si el elemento anterior es mayor que temp,
                // lo desplazamos hacia la derecha.
                while (j >= intervalo && arr[j - intervalo] > temp) {

                    // Movemos el elemento a la siguiente posicion.
                    arr[j] = arr[j - intervalo];

                    // Retrocedemos utilizando el intervalo actual.
                    j -= intervalo;
                }

                // Insertamos el valor temporal en el hueco libre.
                arr[j] = temp;
            }
        }
    }
    /* Metodo para imprimir el contenido del arreglo.
     * @param arr Arreglo que se desea mostrar.
     */
    public static void imprimirArreglo(int[] arr) {

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }

        System.out.println("]");
    }
}

