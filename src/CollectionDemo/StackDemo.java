package CollectionDemo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        System.out.println(s.empty());

        s.push("amol");
        s.push("kajal");
        s.push("Madhuri");
        s.push("Tushar");
        s.push("Mahesh");
        s.push("Jeevitha");
        s.push("Karthik");
        System.out.println(s.empty());

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s);

    }

}
