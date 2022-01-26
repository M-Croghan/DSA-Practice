package algorithms.code.searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int l, int h, int key){
        if (l == h){
            if (arr[l] == key){
                return l;
            }
            else{
                return -1;
            }
        }
        else {
            int mid = (l + h) / 2;
            if (arr[mid] == key){
                return mid;
            }
            else {
                if (key < arr[mid]){
                    return binarySearch(arr, l, mid - 1, key);
                }
                else{
                    return binarySearch(arr, mid + 1, h, key);
                }
            }
        }
    }

    public static int binarySearch2(int[] arr, int l, int h, int key) {
        if (h >= l) {
            int mid = (l + h) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                return binarySearch2(arr, l, mid - 1, key);
            } else {
                return binarySearch2(arr, mid + 1, h, key);
            }
        }
        return -1;
    }
}
