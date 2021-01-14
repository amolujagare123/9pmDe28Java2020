package ClassDemo;

public class ParameterizedConstThis {
    int a;
    double d;
    char ch;
    String str; // data members


    ParameterizedConstThis(int a, double d, char ch, String str) // parameterized constructor
    {                     // above are local variables
       this.a = a;
       this.d = d;
       this.ch = ch;
       this.str = str;

       // a variablke used with this operator is a datamember
    }


    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParameterizedConstThis ob = new ParameterizedConstThis(10,1.1,'g',"abcd"); // object

        ob.display();

        ParameterizedConstThis ob2 = new ParameterizedConstThis(20,2.2,'a',"xyz"); // object

        ob2.display();

    }

}
