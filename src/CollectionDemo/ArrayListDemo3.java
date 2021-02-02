package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

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
        System.out.println(al); //false

        al.remove(2);
        al.remove("Tushar");

        System.out.println(al);

        al.clear();
        System.out.println(al);
    }

}
