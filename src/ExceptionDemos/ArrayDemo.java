package ExceptionDemos;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] =10;
        a[1] =10;
        a[2] =10;
        a[3] =10;
        a[4] =10;
        a[5] =10;

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("End of the program");
    }
}
