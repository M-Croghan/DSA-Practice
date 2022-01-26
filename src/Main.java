import algorithms.code.searching.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,4,9,10,13,25,35,40,55,67,71,80};
//        int[] nums = {2,5};
        System.out.println(BinarySearch.binarySearch2(nums, 0, nums.length - 1, 9));

    }




}
