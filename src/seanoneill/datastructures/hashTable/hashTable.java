package seanoneill.datastructures.hashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashTable {
    public static void hashTableExample(){
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        //adding a (key, value)
        ht.put(10, "Sean");
        ht.put(10, "Tom"); // this will over write sean value and input tom.
        ht.put(11, "Ellen");
        ht.put(30, "Michael");

        System.out.println(ht);

        Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

        h1 = (Hashtable<Integer, String>)ht.clone(); // this will clone ht into h1

        //check if key exists
        if(ht.containsKey(10)){
            System.out.println("Wooo, this key exists");
        }

        //check if value exists
        if(ht.containsValue("Tom")){
            System.out.println("Great! this value exists");
        }

        //get element from hashtable by key, if not exist it will return null
        System.out.println(ht.get(10));

        //check if hashtable is empty
        if(ht.isEmpty() == true){
            System.out.print("This hashtable is empty");
        }

        // get all keys for hashtable
        Enumeration ht_keys = ht.keys();

        while(ht_keys.hasMoreElements()){
            System.out.println(ht_keys.nextElement());
        }
    }

    public static void main(String[] args){
        hashTableExample();
    }
}
