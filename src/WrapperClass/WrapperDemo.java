package WrapperClass;

public class WrapperDemo {

    public static void main(String[] args) {

        int i =10 ; // premitive dattype

        Integer ii = new Integer(10);
        // non premitive datatype (object) / wrapper class of int

        Integer ii1 = new Integer(i); // boxing / wrapping

        System.out.println("i="+i);
        System.out.println("ii="+ii);


        Integer ii2 = 12;
        Integer ii3 = i; // autoboxing / autowrapping

        System.out.println("ii2="+ii2);
        System.out.println("ii3="+ii3);


    }
}
