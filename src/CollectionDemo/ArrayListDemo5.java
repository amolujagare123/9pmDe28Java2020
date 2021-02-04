package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {

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
        System.out.println("al="+al);


        ArrayList<String> al2 = new ArrayList<>();

        al2.add("abc1");
        al2.add("abc2");
        al2.add("abc3");
        al2.add("abc4");
        al2.add("Madhuri");
        al2.add("Jeevitha");
        al2.add("Rohith");

        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);
    }

}
