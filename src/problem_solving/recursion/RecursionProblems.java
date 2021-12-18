package problem_solving.recursion;
// Methods within this class solve some basic recursion problems.
public class RecursionProblems {

    // 1. Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively ( without loops).
    public static int factorial(int num){
        if(num == 1){
            return 1;
        }

        return num * factorial(num - 1);
    }

    /* 2. We have a number of bunnies and each bunny has two big floppy ears.
     We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication). */
    public static int bunnyEars(int num){
        if (num == 0){
            return 0;
        }
        if (num == 1){
            return 2;
        }

        return 2 + bunnyEars(num - 1);
    }

    /* 3. The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
    The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the
    sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a
    recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence. */

    public static int fibonacci(int num){
        if (num == 0){
            return 0;
        }
        if (num == 1){
            return 1;
        }

        return fibonacci(num - 2) + fibonacci(num - 1);
    }

    /* We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return
    the number of " ears" in the bunny line 1, 2, ... n (without loops or multiplication). */
    public static int bunnyEars2(int num){
        if (num == 0){
            return 0;
        }

        if (num % 2 == 0){
            return 3 + bunnyEars2(num - 1);
        }

        return 2 + bunnyEars2(num - 1);
    }

    /* 5. We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next
    row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks
    in such a triangle with the given number of rows. */
    public static int triangle(int num){
        if (num == 0){
            return 0;
        }
        if (num == 1){
            return 1;
        }

        return 2 + triangle(num - 1);
    }


    /* 6. Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%)
    by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */
    public static int sumDigits(int n){
        if (n >= 0 && n < 10){
            return n;
        }

        return  (n % 10) + sumDigits(n / 10);

    }

    /* 7. Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
    (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
    the rightmost digit (126 / 10 is 12). */
    public static int count7(int n){
        if (n >= 0 && n < 10 && n != 7){
            return 0;
        }
        if (n == 7){
            return 1;
        }
        return count7(n / 10) + count7(n % 10);
    }

    /* 8. Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
    except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%)
    by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). */
    public static int count8(int n){
        if (n >= 0 && n < 10 && n != 8){
            return 0;
        }
        if (n == 8){
            return 1;
        }
        if ((n % 10 == 8) && (n / 10) % 10 == 8){
            return 2 + count8(n / 10);
        }
        else if ((n % 10 == 8)){
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    // 9. Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
    public static int countHi(String s){
        if (s.length() <= 2){
            if (s.startsWith("hi")){
                return 1;
            }
            else{
                return 0;
            }
        }
        if (s.startsWith("hi")){
            return 1 + countHi(s.substring(1));
        }
        return countHi(s.substring(1));
    }

    // 10. Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to ' y' chars.
    public static String changeXY(String s){
        if (s.length() < 1){
            return "";
        }
        if (s.charAt(0) == 'x'){
            return "y" + changeXY(s.substring(1));
        }
        return s.charAt(0) + changeXY(s.substring(1));
    }

    // 11. Given a string, compute recursively a new string where all the 'x' chars have been removed.
    public static String noX(String s){
        if (s.length() < 1){
            return "";
        }
        if (s.charAt(0) == 'x'){
            return "" + noX(s.substring(1));
        }
        return s.charAt(0) + noX(s.substring(1));
    }

    /* 12. Given a string, compute recursively a new string where identical chars that are adjacent in the original
    string are separated from each other by a "*". */
    public static String pairStar(String s){
        if (s.length() == 1){
            return s.charAt(0) + "";
        }
        if (s.length() == 2){
            if (s.charAt(0) == s.charAt(1)) {
                return s.charAt(0) + "*" + s.charAt(1);
            }
            else{
                return s.charAt(0) + "" + s.charAt(1);
            }
        }
        if (s.charAt(0) == s.charAt(1)){
            return s.charAt(0) + "*" + pairStar(s.substring(1));
        }
        return s.charAt(0) + pairStar(s.substring(1));
    }

    /* 13. Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been
    reduced to a single char. So "yyzzza" yields "yza".*/
    public static String stringClean(String s){
        if (s.length() == 1){
            return "" + s.charAt(0);
        }
        if (s.charAt(0) == s.charAt(1)){
            return stringClean(s.substring(1));
        }
        return s.charAt(0) + stringClean(s.substring(1));
    }

    /* Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not
    count " hi" that have an 'x' immediately before them.*/
    public static int countHi2(String s){
        if (s.length() <= 2){
            if (s.startsWith("hi")){
                return 1;
            }
            return 0;
        }

        if (s.startsWith("hi")){
            return 1 + countHi2(s.substring(1));
        }
        if (s.startsWith("xh")){
            return countHi2(s.substring(2));
        }

        return countHi2(s.substring(1));
    }

    // Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
    public static int strDist(String s, String sub){
        if (!s.equals(sub) && s.length() <= sub.length()){
            return 0;
        }
        if (!s.startsWith(sub)){
            return strDist(s.substring(1), sub);
        }
        if (!s.endsWith(sub)){
            return strDist(s.substring(0, s.length() - 1), sub);
        }
        return s.length();
    }


}
