package ClassDemo;

public class MyClassConstructor {
    int a;
    double d;
    char ch;
    String str; // data members


    MyClassConstructor() // normal constructor
    {
       a = 10;
       d=1.1;
       ch='f';
       str = "amol1234";
    }


    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClassConstructor ob = new MyClassConstructor(); // object

        ob.display();

        MyClassConstructor ob2 = new MyClassConstructor(); // object

        ob2.display();

    }

}
