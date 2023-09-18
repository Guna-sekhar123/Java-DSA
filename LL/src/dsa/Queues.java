package dsa;

import java.util.*;

public class Queues{
    public static void main(String[] args) {
        // Basic Queue operations.
        Queue<String> books = new LinkedList<String>();
        books.offer("cengage"); // adds the cengage to the queue
        books.offer("manga"); // adds the mange to the queue
        books.poll(); // removes the cengage from the queue
        books.peek(); // prints the first element in the queue
        System.out.println(books.isEmpty()); // returns that the queues are empty or not
        System.out.println(books.size()); // returns the size of the queue
        System.out.println(books.contains("cengage")); // returns the given element present or not.
    }

    static LinkedList<>
}