package algorithms.code;

public class SelectionSort {

    // Own Implementation
    public static void selectionSort(int[] arr){
        for (int sorted = arr.length - 1; sorted > 0; sorted--){
            int max = arr[sorted];
            int j = 0;
            boolean flag = false;
            for (int i = 0; i < sorted; i++){
                if (arr[i] > max){
                    max = arr[i];
                    j = i;
                    flag = true;
                }
            }
            if (flag){
                int temp = arr[sorted];
                arr[sorted] = max;
                arr[j] = temp;
            }
        }
    }

    // SELECTION SORT - O(n^2) || In-Place || Unstable Algorithm || Doesn't require as much swapping as bubble
    // Space Complexity: O(1)
    public static void selectionSort2(int[] array){
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0; //
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
    }

    // Swap helper method - Creates a temporary variable to switch array element positions.
    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
