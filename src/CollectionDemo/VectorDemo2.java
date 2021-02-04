package CollectionDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {


    public static void main(String[] args) {

        Vector<String> v = new Vector<>(3,2);

        System.out.println("Size="+v.size());// 0
        System.out.println("Capacity="+v.capacity());// 10

        v.add("amol");
        v.add("kajal");
        v.add("Madhuri");
        v.add("Madhuri");



        System.out.println(v);

        System.out.println("Size="+v.size());// 7
        System.out.println("Capacity="+v.capacity());//

    }
}
