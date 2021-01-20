package pack2;


import pack1.Java1;

import static FinalAndStatic.StudentStaticMethodDemo.*;

public class Java4 extends Java1 {

        int a4;
        double d4;
        char ch4;
        String str4; // data members

        void display4() // member function
        {
            System.out.println("a4="+a4);
            System.out.println("d4="+d4);
            System.out.println("ch4="+ch4);
            System.out.println("str4="+str4);
        }

        public static void main(String[] args) {

            Java4 ob = new Java4();

            ob.a1 = 12;
           // ob.d1 = 2.3;
            ob.ch1 ='g';

            Java1 ob1 = new Java1();

          //  ob1.ch1 = 'h';


            /*StudentStaticMethodDemo.method2();
            StudentStaticMethodDemo.college;*/

            method2();

        }

}
