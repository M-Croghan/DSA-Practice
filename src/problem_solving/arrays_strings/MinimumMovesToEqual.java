package problem_solving.arrays_strings;
// LEETCODE - 453. Minimum Moves to Equal Array Elements
// DIFFICULTY: MEDIUM
public class MinimumMovesToEqual {
    public static int minTwoMoves(int[] nums) {
        // Set the first number in the array as the minimum.
        int minimum = nums[0];
        // Iterate through the array and update minimum if a smaller number is found
        for (int i = 1; i <= nums.length - 1; i++){
            if (nums[i] < minimum){
                minimum = nums[i];
            }
        }

        // Create counter to track moves.
        int countMoves = 0;
        // Iterate through the array: subtract the minimum number from each element
        // Add this to the countMoves counter
        // I thought about this as though each move was decrementing the bigger numbers until they reached the
        // minimum value. Its easier to visualize than thinking about what the end result will be.
        for (int num : nums) {
            countMoves += num - minimum;
        }
        return countMoves;
    }

    public static void main(String[] args) {
        // Added Unit Test!
        int[] arr = {1,2,3};
        System.out.println(minTwoMoves(arr));
    }
}
