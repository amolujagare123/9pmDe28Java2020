package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo6 {

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


        // removeIf - removes based on some condition
        // 1. remove the string whose second charcter is a

      /*  al.removeIf(str ->  str.charAt(1)=='a'  ) ;

        System.out.println("al="+al);*/

        // 2. remove the string wich contains 'i'

        al.removeIf(abc -> abc.contains("i"));

        System.out.println("al="+al);




    }

}
