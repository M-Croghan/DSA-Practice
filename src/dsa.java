import java.util.Arrays;

public class dsa {

    public static void main(String[] args) {

        int[] arr = {0, 99, -12, 43, 87, 122, -13, 8, 49, 82, 23};
        System.out.println(Arrays.toString(arr));
        ElementarySorts.insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

}
