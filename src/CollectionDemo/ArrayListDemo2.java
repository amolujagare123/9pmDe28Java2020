package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Amol"); // 0
        al.add("Kajal"); // 1
        al.add("Mahesh"); // 2
        al.add("Tushar");// 3
        al.add("Madhuri");
        al.add("Jeevitha");
        al.add("Rohith");
        al.add("Rohith");
        System.out.println(al.isEmpty()); //false

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<String>();
        System.out.println(al2.isEmpty()); // true

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);
    }

}
