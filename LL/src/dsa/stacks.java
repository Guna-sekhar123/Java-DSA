package dsa;
import java.util.Stack;

public class stacks{
    public static void main(String[] args) {
        Stacks<String> books = new Stack<String>();
        books.push("cengage");
        books.push("comics");
        books.push("mange");
        books.pop();
        System.out.println(books);
    }
}