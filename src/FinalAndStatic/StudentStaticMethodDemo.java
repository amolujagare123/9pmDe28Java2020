package FinalAndStatic;

public class StudentStaticMethodDemo {

    int rno;
    String name;
    public static String college="ITC";

    void display() // non static method
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college); // static variable
        method1(); // static method

    }

    static void method1()
    {
        System.out.println("Method 1");
    }

    public static void method2()
    {
       // display(); // not allowed - non static

        method2(); // allowed - static

      //  rno =10; // not allowed - non static

        college =""; // allowed - static

        System.out.println("Method 2");
    }



    public static void main(String[] args) {

      /*  StudentStaticMethodDemo ob = new StudentStaticMethodDemo();

        ob.method2();*/

        StudentStaticMethodDemo.method2();

    }

}
