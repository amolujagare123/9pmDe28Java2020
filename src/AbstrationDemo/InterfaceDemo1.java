package AbstrationDemo;

public interface InterfaceDemo1 {

    void start();
    void run();

    default void myMethod1() // non static , non abstract
    {

    }
    static void myMethod2() // public , non abstract
    {

    }
}

class  ChildInterface implements InterfaceDemo1
{
    public void run()
    {
        System.out.println("inside run");
    }

    public void start()
    {
        System.out.println("inside start");
    }

    public static void main(String[] args) {

        InterfaceDemo1 ob = new ChildInterface(); // upcasting

        ob.myMethod1();
        ob.run();
        ob.start();

        InterfaceDemo1.myMethod2();
        // static members from interface can be called using the interface name only
        // not with the object reference

      //  InterfaceDemo1 ob1 = new InterfaceDemo1();

    }

}