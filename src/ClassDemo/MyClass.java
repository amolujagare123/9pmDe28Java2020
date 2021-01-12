package ClassDemo;

public class MyClass {

    int a;
    double d;
    char ch;
    String str; // data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass ob = new MyClass(); // object

        ob.a =10 ;
        ob.ch='d';
        ob.d = 23.45;
        ob.str ="amol";

        ob.display();

        MyClass ob2 = new MyClass();

        ob2.a = 1;
        ob2.ch ='a';
        ob2.d = 1.1;
        ob2.str ="xyz";

        ob2.display();
    }

}
