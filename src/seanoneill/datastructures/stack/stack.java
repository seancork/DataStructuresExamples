package seanoneill.datastructures.stack;

import java.util.Iterator;
import java.util.Stack;

public class stack {
    public static void stackExample(){

    }

    public static void main(String args[]){
        Stack<String> s_1 = new Stack<>();

        s_1.push("Sean");
        s_1.push("Ellen");


        //if stack is empty it will throw .EmptyStackException for pop and peek
        // Gives which one it poped
        String pop_S_1 = s_1.pop();

        System.out.println("Stack.pop() => " +pop_S_1);
        System.out.println("Current Stack => " +s_1);

        //look at top item without removing it
        String peek_s_1 = s_1.peek();

        System.out.println("Stack.peek() => " +peek_s_1);
        System.out.println("Current Stack => " +s_1);

        System.out.println("Stack empty: " +s_1.isEmpty());

        int position =  s_1.search("Sean");

        if(position != -1){
            System.out.println("The element was found at: " +position);
        }else{
            System.out.println("The Element was not found :(");
        }

        //check size of stack
        System.out.println("Size of stack: " +s_1.size());

        //iterate elemnts of the stack
        Iterator it = s_1.iterator();
        while(it.hasNext()){
            Object value = it.next();
            System.out.println(value);
        }
    }
}
