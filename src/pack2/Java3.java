package pack2;

import pack1.Java1;

public class Java3 {

        int a3;
        double d3;
        char ch3;
        String str3; // data members

        void display3() // member function
        {
            System.out.println("a3="+a3);
            System.out.println("d3="+d3);
            System.out.println("ch3="+ch3);
            System.out.println("str3="+str3);
        }

        public static void main(String[] args) {

            Java1 ob = new Java1();
            ob.a1 =10; // public
          /*  ob.d1=20.4;
            ob.c1='g';
            ob.str1="fdff";
            ob.display1();
*/
        }

}
