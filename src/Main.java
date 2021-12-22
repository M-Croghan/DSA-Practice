import problem_solving.arrays_strings.SimpleArrayStringProblems;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {0,1,3,5,7,9};
        int[] arr2 = {2,4,6,8};
        System.out.println(Arrays.toString(SimpleArrayStringProblems.mergeSortedArrays(arr1, arr2)));
    }

}
