package data_structures.hashtables;

// The Map interface implements: HashMap, HashTable, LinkedHashMap, & TreeHashMap
// Thread Safe & Synchronized? HashMap - No, HashTable - Yes
// Speed using thread(s)? HashMap - Fast, only using 1, HashTable - Slow, works with multiple threads.
// Null key? - HashMap  allows 1 null key. HashTable - does not allow null key.
// Linked HashMap is implemented when you want / need insertion order to be fetched.
// Map<datatype, datatype> mapName = new HashMap()

import java.util.Arrays;

// Currently, doesn't handle collisions!
public class HashTable {

    private int[] array;

    public HashTable(int size){
        if (size < 1){
            throw new IllegalArgumentException("Invalid Hash Table Size! Must be greater than 1!");
        }
        else {
            this.array = new int[size];
        }
    }

    // Pretty Terrible hash function!
    private int hashFunction(String key){
        int hash = 0;
        for (int i = 0; i < key.length(); i++){
            hash = (hash + Character.getNumericValue(key.charAt(i)) * i) & key.length();
        }
        return hash;
    }

    public void set(String key, int value){
        this.array[hashFunction(key)] = value;
    }

    public int get(String key){
        return this.array[hashFunction(key)];
    }

    public void printHashTable(){
        System.out.println(Arrays.toString(this.array));
    }

}
