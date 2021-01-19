package InheritanceDemos;

public /*final*/ class BaseClass {


    /*final*/ void sample()
    {
        System.out.println("Sample in Base class");
    }

}

final class DerivedClass extends BaseClass
{

    void sample() // this method is said to be an overridden method
    {
        System.out.println("Sample in Derived Class");
    }


    public static void main(String[] args) {
       /* DerivedClass derivedClass = new DerivedClass();
        derivedClass.sample();*/

        BaseClass baseClass = new DerivedClass(); // upcasting


        baseClass.sample(); // call to child class method

    }
}

