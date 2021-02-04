package CollectionDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("amol");
        s.push("kajal");
        s.push("Madhuri");
        s.push("Tushar");
        s.push("Mahesh");
        s.push("Jeevitha");
        s.push("Karthik");

        System.out.println(s);

        System.out.println(s.search("Jeevitha"));

    }

}
