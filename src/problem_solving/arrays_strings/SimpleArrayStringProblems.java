package problem_solving.arrays_strings;

import java.util.Arrays;
import java.util.HashMap;

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

    public static int firstUniqueChar(String s) {
        HashMap<Character, Integer> ht = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (ht.containsKey(s.charAt(i))){
                return i;
            }
            else {
                ht.put(s.charAt(i), i);
            }
        }
        return -1;
    }

    // CTCI #1 - Inefficient
    static boolean isUnique(String s){
        for (int i = 0; i < s.length(); i++){
            for (int j = 1; j < s.length(); j++){
                if (i == j){
                    continue;
                }
                else if (s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    //
    public static boolean isUnique1(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (hm.containsKey(s.charAt(i))){
                return false;
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }
        return true;
    }

    // CTCI #2 - Check Permutations w/ helper sort method
    static boolean checkPermutation(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        return sort(s1).equals(sort(s2));

    }
    static String sort(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }

    static boolean checkPermutation2(String s1, String s2){
        int[] characters = new int[128];
        for (int i = 0; i < s1.length(); i++){
            characters[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++){
            characters[s2.charAt(i)]--;
            if (characters[s2.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }

    static String URLify(String s){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                str.append("%20");
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
