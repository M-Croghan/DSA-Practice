package problem_solving.arrays_strings;
// LEETCODE - 1023. Camelcase Matching
// DIFFICULTY: MEDIUM
public class CamelCaseMatch {
    //

    public static boolean[] findPattern(String[] queries, String pattern) {
        // Creates an array the same size of the queries array passed. Will return booleans based on if pattern is found.
        boolean[] patternChecks = new boolean[queries.length];

        // Iterates through each word in the array and passed the individual word and the pattern for the query to
        // checkPattern(). The boolean returned is stored inside of patternChecks at the same index of the word.
        for(int i = 0; i < queries.length; i++){
            patternChecks[i] = checkPattern(queries[i], pattern);
        }
        // boolean array denoting whether the pattern matches for each word at the same index of the queries array.
        return patternChecks;
    }

    // Checks each word by iterating over the string, scanning for the pattern.
    public static Boolean checkPattern(String s, String pattern){
        // Keeps track of if each character of the pattern found
        int found = 0;
        // Iterates over each character in the string
        for(int i = 0; i < s.length(); i++){
            // If the character at the current position matches the character at the same position in the pattern
            // Increment found variable denoting one element of the pattern has been found.
            if(found < pattern.length() && s.charAt(i) == pattern.charAt(found)){
                found++;
            }
            // If character is not the same, immediately return false.
            else if(Character.isUpperCase(s.charAt(i))){
                return false;
            }
        }
        // After scanning the string, if the found variable matches the length of the pattern, then true is returned.
        return found == pattern.length();
    }
}
