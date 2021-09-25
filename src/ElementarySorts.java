// Unstable vs. Stable Algorithms
// If an array has two of the same value, will the relative value of them stay the same when sorted?
// In UNSTABLE - relative position will not be preserved. In STABLE - position WILL be preserved.
// These elementary / fundamental algorithms operate in O(n^2) time & O(1) Space complexity!
public class ElementarySorts {

    // BUBBLE SORT - Stable sort (Swap Method)
    /* Arguably one of the worst algorithms as performance tends to degrade as the total number
    * of elements that require sorting increases. This algorithm sorts IN PLACE and operates in O(n^2). */
    public static void bubbleSort(int[] array){
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

    // Swap method - Creates a temporary variable to switch array element positions.
    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // SELECTION SORT - O(n^2) || In-Place || Unstable Algorithm || Doesn't require as much swapping as bubble
    // Space Complexity: O(1)
    public static void selectionSort(int[] array){
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

    // INSERTION SORT - O(n^2) Quadratic || Stable & In-Place Algorithm || Space Complexity: O(1)
    // Grows the sorted partition from the front of the array (left to right)
    // Works well in the event data in coming in at real time.
    public static void insertionSort(int[] array){
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
