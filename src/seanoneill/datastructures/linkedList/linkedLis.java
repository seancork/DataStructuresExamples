package seanoneill.datastructures.linkedList;

import java.util.LinkedList;

public class linkedLis {
   public static void LinkedListFirstExample() {
       LinkedList<String> list = new LinkedList<String>();
         list.add("sean");
         list.add("Ellen");
         list.add("Joe");
         list.add("Jack");

         list.add(0, "Tom"); // this will add to TOM to index 0 and move everything else in the list on
                                         // It will not delete the item already at 0 just move it to postion 1.
         System.out.println(list);

         list.removeFirst();
         list.removeLast();
         list.remove("sean");//remove sean from list
         list.remove(0);  //remove by index

         System.out.println(list);

         list.set(0, "Changed");

         System.out.println(list);

       System.out.println("Size of linkedlist: "+ list.size()); //get size of list

       // Iterating  a linkedlist by using get
       for(int i = 0; i < list.size(); i++){

           System.out.println(list.get(i));
       }

   }
    public static void main(String args[]) {
        LinkedListFirstExample();
    }
}