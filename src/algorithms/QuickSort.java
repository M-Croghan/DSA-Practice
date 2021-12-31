package algorithms;

public class QuickSort {

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int j = start;
        // Keep placing elements less than the pivot element to the left
        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                // Swap array[i] with array[j]
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                j++;
            }
        }

        // Place the pivot i.e array[end] at its final position and return the pivot index
        // for partitioning the array
        int tmp = array[j];
        array[j] = array[end];
        array[end] = tmp;

        return j;
    }

    public static void quickSort(int[] array, int start, int end) {
        int p;

        if (start < end) {
            p = partition(array, start, end);
            quickSort(array, start, p - 1);
            quickSort(array, p + 1, end);
        }
    }
}
