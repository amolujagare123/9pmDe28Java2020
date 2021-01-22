package ExceptionDemos;

public class DivisionDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        int c =0;

        try {
            c = a / b;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");

            System.out.println("Message="+e.getMessage());
            System.out.println("Class name="+e.getClass());
            System.out.println(e);

            e.printStackTrace();
        }
        finally {
            System.out.println("inside finally");
            // finally block will execute
            // irrespective of whethere there is an exception or not an exception
        }


        System.out.println("c="+c);

        System.out.println("End of the program");

    }


}
