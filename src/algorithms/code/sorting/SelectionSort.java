package algorithms.code.sorting;

public class SelectionSort {

    // Own Implementation
    public static void selectionSort(int[] arr){
        // Outer loop starts by treating the last element as the largest and as though it is already sorted.
        for (int sorted = arr.length - 1; sorted > 0; sorted--){
            // Targets the last element in the array to start, but changes to the last sorted item.
            int max = arr[sorted];
            // Lets you store the index of the new max value that was found.
            int j = 0;
            // Denotes if any new max elements are found!
            boolean flag = false;
            // Inner loop, scans for the largest element existing to
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
