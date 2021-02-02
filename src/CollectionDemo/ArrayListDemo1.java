package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

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
        System.out.println(al);
        // for each loop - only if list is homogeneous

        System.out.println("====using or each loop===");
        for(String str : al)
        {
            System.out.println(str);
        }



        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(12);
        al2.add(13);
        al2.add(14);
        al2.add(15);
        System.out.println(al2);
        System.out.println("====using or each loop===");

        for(Integer a : al2)
        {
            System.out.println(a);
        }


    }

}
