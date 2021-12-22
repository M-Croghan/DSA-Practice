package problem_solving.arrays_strings;

public class SimpleArrayStringProblems {

    // Reverse a string with StringBuilder
    public static StringBuilder reverseString(String s){
        StringBuilder returnString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--){
            returnString.append(s.charAt(i));
        }
        return returnString;
    }

    // Merge 2 Sorted Arrays
    // Inputs:
    // int[] arr1 = {0,1,3,5,7,9};
    // int[] arr2 = {2,4,6,8};
    // INCOMPLETE
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];
        int numOfItems = arr1.length + arr2.length;
        int a = 0;
        int i = 0;
        int j = 0;

        while (j < arr2.length){
            if (arr1[i] < arr2[j]){
                merged[a] = arr1[i];
                a++;
                i++;
            }
            else{
                merged[a] = arr2[j];
                a++;
                j++;
            }
        }

        return merged;
    }
}
