package ClassDemo;

public class MyClassCopyConst {
    int a;
    double d;
    char ch;
    String str; // data members


    MyClassCopyConst()
    {
        // no body - Empty constructor
    }

    MyClassCopyConst(MyClassCopyConst obj)
    {
       a = obj.a; // 10
       d = obj.d; // 23.45
       ch = obj.ch;//'d'
       str = obj.str; // "amol"
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        MyClassCopyConst ob = new MyClassCopyConst(); // object
        ob.a =10 ;
        ob.ch='d';
        ob.d = 23.45;
        ob.str ="amol";
        ob.display();


        MyClassCopyConst ob1 = new MyClassCopyConst();
        ob1.display();

        MyClassCopyConst ob2 = new MyClassCopyConst(ob);
        ob2.display();

    }

}
