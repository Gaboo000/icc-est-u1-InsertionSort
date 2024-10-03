public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento ordenamiento = new MetodoOrdenamiento();

        int[] array = {1,6,9,4,62,19,849,65,49,84,984};
        int[] sortedArray = ordenamiento.InsertionSort(array, true);

        ordenamiento.printArray(sortedArray);
        


    }
}
