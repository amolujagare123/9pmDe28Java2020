package InheritanceDemos;

public class OverloadingDemo {

    int a;
    int b;

    void addition()
    {
        /* a = 10 ;
        b = 20 ;  */
        int c= a+b;
        System.out.println("Addition="+c);
    }

    void addition(int x,int y) // arguments / parameters are differnt
    {
        int c = x+y;
        System.out.println("Addition="+c);
    }

    void addition(int a1 , int b1,int c1)
    {
        int c = a1 + b1 + c1;
        System.out.println("Addition="+c);
    }

    void addition(double d1, double d2)
    {
        double d3 = d1 + d2;

        System.out.println("Addition="+d3);
    }

    void addition(String str1,String str2)
    {
       /* str1 = "text1";
        str2 = "text2";*/

        System.out.println(str1+str2);
    }
    public static void main(String[] args) {

        OverloadingDemo ob = new OverloadingDemo();

        ob.a =11;
        ob.b =12;

        ob.addition();

        ob.addition(12,22);

        ob.addition(12,22, 12);

        ob.addition(1.1, 2.2);

        ob.addition("abcd","xyz");
    }


}
