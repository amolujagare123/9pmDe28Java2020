package CollectionDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {


    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("amol");
        v.add("kajal");
        v.add("Madhuri");
        v.add("Tushar");
        v.add("Mahesh");
        v.add("Jeevitha");
        v.add("Karthik");

        System.out.println(v);

        System.out.println(v.contains("Tushar")); // true
        System.out.println(v.contains("Rohith")); // false

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        System.out.println("====printing array==========");
        Object[] o = v.toArray();

        for(int i=0;i<o.length;i++)
        {
            System.out.println(o[i]);
        }

        System.out.println("==== using enumeration ==========");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}
