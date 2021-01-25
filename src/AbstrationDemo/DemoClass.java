package AbstrationDemo;

public abstract class DemoClass {

    abstract void run();
    abstract void start();


     void display() // concrete menthod / non abstract method
     {
         System.out.println("inside display");
     }

    public static void main(String[] args) {

      //  DemoClass ob =new DemoClass(); // not allowed- cant be instantiated
    }

}

class ChildDemo extends DemoClass
{
    void run()
    {
        System.out.println("inside run");
    }

    void start()
    {
        System.out.println("inside start");
    }


    public static void main(String[] args) {

        ChildDemo ob = new ChildDemo();
        ob.start();
        ob.run();
        ob.display();

        DemoClass demoClass = new ChildDemo(); // upcasting

        demoClass.display();
        demoClass.run();
        demoClass.start();

    }

}
