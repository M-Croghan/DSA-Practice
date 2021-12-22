import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        String s = "leetcode";
        System.out.println(firstUniqueChar(s));
    }

    public static int firstUniqueChar(String s) {
        Hashtable ht = new Hashtable<>();
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

}
