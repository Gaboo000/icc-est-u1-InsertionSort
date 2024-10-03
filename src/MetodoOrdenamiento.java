import java.util.Arrays;

public class MetodoOrdenamiento {

    public int[] InsertionSort (int [] array, boolean mostrarLogs){
        if (mostrarLogs) {
        System.out.println("Lista inicial: " + Arrays.toString(array));
    }

    // Tamaño del arreglo
    int longitud = array.length;

    // Comenzar desde el segundo elemento (el primero ya está "ordenado")
    for (int i = 1; i < longitud; i++) {
        if (mostrarLogs) {
            System.out.println("Iteración número " + i);
        }

        // Elemento que se va a insertar en la parte ordenada del arreglo
        int valorActual = array[i];

        // Variable para recorrer la porción ordenada de la lista
        int j = i - 1;

        if (mostrarLogs) {
            System.out.println("\ti=" + i + " j=" + j + " [i]=" + array[i] + " [j]=" + array[j]);
        }

        // Desplazar los elementos mayores que el valorActual hacia adelante
        while (j >= 0 && array[j] > valorActual) {
            if (mostrarLogs) {
                System.out.println("\t\tComparando " + valorActual + " con " + array[j]);
            }

            array[j + 1] = array[j];
            j--;

            if (mostrarLogs) {
                System.out.println("\t\t--------" + Arrays.toString(array));
            }
        }

        // Colocar el valorActual en su posición correcta
        array[j + 1] = valorActual;

        if (mostrarLogs) {
            System.out.println("\t--------" + Arrays.toString(array));
        }
    }

    return array;


    }    


    public void printArray(int[] arreglo) {
        System.out.println("Resultado: " + Arrays.toString(arreglo));
    }
}
