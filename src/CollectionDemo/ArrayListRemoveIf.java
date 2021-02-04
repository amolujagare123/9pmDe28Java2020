package CollectionDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf {

    public static void main(String[] args) {

        ArrayList<Character> al2 = new ArrayList<>();

        al2.add('a');//
        al2.add('b');
        al2.add('c');
        al2.add('d');
        al2.add('e');//
        al2.add('f');
        al2.add('g');
        al2.add('h');
        al2.add('i');//
        al2.add('j');
        al2.add('k');
        al2.add('l');

        // a --> if( a=='a' || a=='e' || a == 'i' || a == 'o' || a=='u'  )

        System.out.println(al2);
        al2.removeIf(a -> (a=='a' || a=='e' || a == 'i' || a == 'o' || a=='u') );

        System.out.println(al2);
    }

}
