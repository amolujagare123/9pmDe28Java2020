package ClassDemo;

public class MyClass1 {
    int a;
    double d;
    char ch;
    String str; // data members


    MyClass1()
    {
        // no body - Empty constructor
    }


    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass1 ob = new MyClass1(); // object
       /* ob.a =10 ;
        ob.ch='d';
        ob.d = 23.45;
        ob.str ="amol";*/

        ob.display();

    }

}
