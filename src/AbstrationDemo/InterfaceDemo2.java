package AbstrationDemo;

public interface InterfaceDemo2 {

    void start();
    void run();

    default void myMethod1() // non static , non abstract
    {

    }


    void display();
}

interface AnotherInterface
{


    void display();
}

class MyClass
{

}


class  ChildInterface1 extends MyClass implements InterfaceDemo2,AnotherInterface
{
    public void run()
    {
        System.out.println("inside run");
    }

    public void start()
    {
        System.out.println("inside start");
    }

    public void display()
    {
        System.out.println("inside display");
    }

    public static void main(String[] args) {

        InterfaceDemo2 interfaceDemo2 = new ChildInterface1();

        interfaceDemo2.display();

        ChildInterface1 ob = new ChildInterface1();


    }

}