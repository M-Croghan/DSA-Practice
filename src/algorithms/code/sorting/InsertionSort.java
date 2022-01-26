package algorithms.code.sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int currentValue = arr[i]; // Anything to the left of currentValue is already sorted!
            int j = i - 1;
            while (j >= 0 && currentValue < arr[j]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
    }

    // INSERTION SORT - O(n^2) Quadratic || Stable & In-Place Algorithm || Space Complexity: O(1)
    // Grows the sorted partition from the front of the array (left to right)
    // Works well in the event data in coming in at real time.
    public static void insertionSort2(int[] array){
        for (int i = 1; i < array.length; i++){
            int currentValue = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > currentValue; j--){
                array[j + 1] = array[j];
            }
            array[j + 1] = currentValue;
        }
    }
}
