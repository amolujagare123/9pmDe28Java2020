package WrapperClass;

public class WrapperDemo2 {

    public static void main(String[] args) {


        Integer value = new Integer(10);
        // non premitive datatype (object) / wrapper class of int

        int a = value.intValue(); // unboxing / unwrapping

        System.out.println("a="+a);

        int b = value; // auto unboxing / auto unwrapping
        System.out.println("b="+b);


    }
}
