package algorithms.code.sorting;
// Worst Case - O(n^2) Quadratic
// Average Case - O(n log n) Linearithmic

// Choosing a pivot influences time complexity.
// First or last items may not be good choices as if you want to forward or reverse sort a list already in sorted
// order, you could get the worst case O(n^2) performance. Additionally, you could choose the middle item or the middle
// or median of 3 items which would yield better performance.
// Randomly chosen pivots ensure O(n log n), especially in large lists.

import java.util.Random;
// QUICK SORT - VERSION #2
public class QuickSort {

    // Only method that the user has to / is able to interact with.
    // Takes in an array and passed it to an overloaded quickSort() method.
    public void quickSort(int[] a){
        quickSort(a, 0, a.length - 1);
    }

    // This overloaded method takes an array, and determines the smallest and largest index of said array.
    private void quickSort(int[] a, int low, int high){
        // Ensures there is more than 1 value to partition. If only one element, assume its sorted!
        if (low < high + 1){
            // Splits array into left & right partitions based on the pivot
            int p = partition(a, low, high);
            quickSort(a, low, p - 1);
            quickSort(a, p + 1, high);
        }
    }

    // Helpful swap method used to swap values
    private void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    // Returns random pivot index between low & high
    private int getPivot(int low, int high){
        Random random = new Random();
        return random.nextInt((high - low) + 1) + low;
    }

    // Moves all n < pivot to the left of pivot & all n > pivot to the right of pivot.
    // Then returns pivot index.
    private int partition(int[] a, int low, int high){
        swap(a, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++){
            if (a[i] < a[low]){
                swap(a, i, border++);
            }
        }
        swap(a, low, border - 1);
        return border - 1;
    }


// QUICK SORT - VERSION #1
//    public static int partition(int[] array, int start, int end) {
//        int pivot = array[end];
//        int j = start;
//        // Keep placing elements less than the pivot element to the left
//        for (int i = start; i < end; i++) {
//            if (array[i] < pivot) {
//                // Swap array[i] with array[j]
//                int tmp = array[i];
//                array[i] = array[j];
//                array[j] = tmp;
//                j++;
//            }
//        }
//
//        // Place the pivot i.e array[end] at its final position and return the pivot index
//        // for partitioning the array
//        int tmp = array[j];
//        array[j] = array[end];
//        array[end] = tmp;
//
//        return j;
//    }
//
//    public static void quickSort(int[] array, int start, int end) {
//        int p;
//
//        if (start < end) {
//            p = partition(array, start, end);
//            quickSort(array, start, p - 1);
//            quickSort(array, p + 1, end);
//        }
//    }
}
