package pack1;

public class Java1 {

       public int a1;
       private double d1;

      protected  char ch1; // lets access this memebr out side the package

    // in Java4 class in pack2

        String str1; // data members

        public void display1() // member function
        {
            System.out.println("a1="+a1);
            System.out.println("d1="+d1);
            System.out.println("ch1="+ch1);
            System.out.println("str1="+str1);
        }

        public static void main(String[] args) {

            Java1 ob = new Java1();
            ob.a1 = 10 ;
            ob.d1 =  1.1;
            ob.ch1 ='v';
            ob.str1="dsds";
            ob.display1();

        }

}
