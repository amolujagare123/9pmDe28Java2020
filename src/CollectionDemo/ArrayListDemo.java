package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("Amol"); // 0
        al.add("Kajal"); // 1
        al.add("Mahesh"); // 2
        al.add("Tushar");// 3
        al.add("Madhuri");
        al.add("Jeevitha");
        al.add("Rohith");
        al.add("Rohith");
        al.add(12);
        al.add(1.2);
        al.add('a');
        al.add(true);

        System.out.println(al);

        System.out.println("list size="+al.size());

        System.out.println("===using for loop=========");

        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("===using Iterator=========");
        Iterator itr = al.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

    }

}
