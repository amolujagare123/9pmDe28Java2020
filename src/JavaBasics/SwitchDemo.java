package JavaBasics;

public class SwitchDemo {
    public static void main(String[] args) {

        int a =10;
        int b = 2;
        int c;

        String operation = "div";

        switch (operation)
        {
            case "add" : c = a+b;
                System.out.println("JavaBasics.Addition="+c);
                break;
            case "sub" : c = a-b;
                System.out.println("substraction="+c);
                break;
            case "mul" : c = a*b;
                    System.out.println("Multiplication="+c);
                    break;
            case "div" : c =a/b;
                System.out.println("Division="+c);
                break;
        }
    }
}
