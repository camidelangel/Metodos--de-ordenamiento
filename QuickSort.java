package Metodos_de_ordenamiento;
/*
 * Clase que implementa el algoritmo de ordenamiento QuickSort.
 * QuickSort utiliza la tecnica de divide y venceras.
 * Selecciona un pivote y divide el arreglo en dos partes:
 * elementos menores o iguales al pivote y elementos mayores.
 * Utiliza el esquema de particion Lomuto.
 */
public class QuickSort {

    /* Metodo principal para ordenar el arreglo.
     * @param arr Arreglo de enteros que se desea ordenar.
     */
    public static void ordenar(int[] arr) {

        // Verificamos que el arreglo no sea nulo
        // y que tenga elementos para ordenar.
        if (arr != null && arr.length > 1) {

            quickSort(arr, 0, arr.length - 1);
        }
    }
    /* Metodo recursivo que realiza el ordenamiento.
     * @param arr Arreglo que se va a ordenar.
     * @param inicio Indice inicial del subarreglo.
     * @param fin Indice final del subarreglo.
     */
    private static void quickSort(int[] arr, int inicio, int fin) {

        // Verificamos que exista un subarreglo valido.
        if (inicio < fin) {

            // Obtenemos la posicion final del pivote
            // despues de realizar la particion.
            int posicionPivote = particionar(arr, inicio, fin);

            // Ordenamos recursivamente la parte izquierda.
            quickSort(arr, inicio, posicionPivote - 1);

            // Ordenamos recursivamente la parte derecha.
            quickSort(arr, posicionPivote + 1, fin);
        }
    }

    /* Metodo que realiza la particion utilizando Lomuto.
     * @param arr Arreglo que se va a particionar.
     * @param inicio Indice inicial.
     * @param fin Indice final, donde se encuentra el pivote.
     * @return Posicion definitiva del pivote.
     */
    private static int particionar(int[] arr, int inicio, int fin) {

        // Seleccionamos el ultimo elemento como pivote.
        int pivote = arr[fin];

        // i representa la frontera de los elementos
        // menores o iguales al pivote.
        int i = inicio - 1;

        // j recorre el arreglo buscando elementos
        // menores o iguales al pivote.
        for (int j = inicio; j < fin; j++) {

            // Comparamos el elemento actual con el pivote.
            if (arr[j] <= pivote) {

                // Avanzamos la frontera.
                i++;

                // Intercambiamos los elementos.
                intercambiar(arr, i, j);
            }
        }

        // Colocamos el pivote en su posicion definitiva.
        intercambiar(arr, i + 1, fin);

        // Regresamos la posicion del pivote.
        return i + 1;
    }

    /* Metodo auxiliar para intercambiar dos elementos.
     * @param arr Arreglo donde se realiza el intercambio.
     * @param i Primera posicion.
     * @param j Segunda posicion.
     */
    private static void intercambiar(int[] arr, int i, int j) {

        int temporal = arr[i];

        arr[i] = arr[j];

        arr[j] = temporal;
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
