package JavaBasics;

public class IncrementDecrement {

    public static void main(String[] args) {

        int i =10 ;
        //i++ (i=i+1) / i-- (i=i-1) It first executes the statements
        //Then increment or decrement

        //++i (i=i+1) / --i (i=i-1) It first increment or decrement
        //Then executes the statements

        System.out.println(i++); // 10
        System.out.println(i);// 11
        System.out.println(++i);// 12
        System.out.println(i); // 12

        // i =12

        System.out.println(i--); // 12
        System.out.println(i);// 11
        System.out.println(--i);// 10
        System.out.println(i); // 10
    }
}
