public class Sorter {

    // BUBBLE SORT
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
}
