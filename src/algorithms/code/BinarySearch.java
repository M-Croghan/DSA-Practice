package algorithms.code;

public class BinarySearch {

    public static int binarySearch(int[] array, int x, int low, int high) {
        int mid = -1;
        if (high >= low) {
            mid = (low + high) / 2;
            if (x == array[mid]) {
                return mid;
            } else if (x < array[mid]) {
                mid = binarySearch(array, x, low, mid - 1);
            } else {
                mid = binarySearch(array, x, mid + 1, high);
            }
        }
        return mid;
    }

}
