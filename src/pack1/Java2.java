package pack1;

public class Java2 {

        int a2;
        double d2;
        char ch2;
        String str2; // data members

        void display2() // member function
        {
            System.out.println("a2="+a2);
            System.out.println("d2="+d2);
            System.out.println("ch2="+ch2);
            System.out.println("str2="+str2);
        }

        public static void main(String[] args) {

            Java1 ob = new Java1();

            ob.a1 =10;
           // ob.d1= 1.2;
            ob.ch1 ='h';
            ob.str1="dsds";
            ob.display1();

         //   ob.a2 =10;


        }

}
