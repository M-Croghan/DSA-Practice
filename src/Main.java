import data_structures.linkedlists.SinglyLinkedList;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList(10);
        list.append(1);
        list.append(45);
        list.append(177);
        list.prepend(25);
        list.prepend(85);
        list.append(11);
        list.insert(6, 400);
        list.insert(8, 333);
        list.remove(8);
        list.printLinkedList();

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

}
