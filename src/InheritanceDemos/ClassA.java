package InheritanceDemos;

public class ClassA { // inheritance

    int a1;
    int b1;

}


class ClassB extends  ClassA
{
    int a2;
    int b2;

    public static void main(String[] args) {

        ClassB ob = new ClassB();

        ob.a2 = 10;
        ob.b2 = 20;

        ob.a1 = 1;
        ob.b1 = 2;
    }

}
