package ClassDemo;

public class MyClassParameterizedConstructor {
    int a;
    double d;
    char ch;
    String str; // data members


    MyClassParameterizedConstructor(int x, double y, char z, String s) // parameterized constructor
    {
       a = x;
       d =y;
       ch = z;
       str = s;
    }


    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClassParameterizedConstructor ob = new MyClassParameterizedConstructor(10,1.1,'g',"abcd"); // object

        ob.display();

        MyClassParameterizedConstructor ob2 = new MyClassParameterizedConstructor(20,2.2,'a',"xyz"); // object

        ob2.display();

    }

}
