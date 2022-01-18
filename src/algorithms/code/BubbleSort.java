package algorithms.code;

// BUBBLE SORT - Stable sort (Swap Method)
/* Arguably one of the worst algorithms as performance tends to degrade as the total number
 * of elements that require sorting increases. This algorithm sorts IN PLACE and operates in O(n^2). */
public class BubbleSort {
    // Bubble Sort - Own implementation
    public static void bubbleSort(int[] arr){
        for (int sorted = arr.length - 1; sorted > 0; sorted--){
            for (int i = 0; i < sorted; i++){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    // Walkthrough - using swap helper function
    public static void bubbleSort2(int[] array){
        // Outer for-loop - aids in partitioning sorted vs. unsorted
        for (int lastUnsortedIndex =  array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            // Inner for-loop starts at the beginning of the array and compared the next value.
            for (int i = 0; i < lastUnsortedIndex; i++){
                // if the current value is greater than the one following it, the swap method switches them.
                if (array[i] > array[i+1]){
                    swap(array, i, i+1);
                }
            }
        }
    }

    // Swap helper - Creates a temporary variable to switch array element positions.
    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
