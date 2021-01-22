package ExceptionDemos;

public class ThrowDemo {

    void validate(int i) throws Exception {
        // accept only the numbers between 1 to 10

        if(i >=1 && i<=10)
            System.out.println("We are safe");
        else
            throw new InterruptedException("We are in danger");

    }

    public static void main(String[] args) throws Exception {

        ThrowDemo ob = new ThrowDemo();

        ob.validate(61);

        System.out.println("End of the program");


    }

}
