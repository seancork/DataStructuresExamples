package seanoneill.datastructures.hashmap;

import java.util.HashMap;

public class hashMap {
    public static void hashMapExample(){

        //create hashmap
        HashMap<String, String> h_m = new HashMap<String, String>();

        // add elements to hashMap
        h_m.put("One", "Sean");
        h_m.put("Two", "Ellen");

        System.out.println(h_m);

        // this wil overwrite Ellen because of key being the same
        h_m.put("Two", "Michael");
        System.out.println(h_m);

        //get an element
        System.out.println(h_m.get("One"));

        //remove element
        h_m.remove("Two");
        System.out.println(h_m);

        //get size
        System.out.println(h_m.size());

        //looping though hashmap
        for(String i: h_m.keySet()){
            System.out.println("key: " +i+ " Value: " +h_m.get(i));

        }
    }

    public static void main(String args[]){
        hashMapExample();
    }
}
