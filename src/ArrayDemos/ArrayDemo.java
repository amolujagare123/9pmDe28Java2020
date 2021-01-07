package ArrayDemos;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 33;
        a[1] = 13;
        a[2] = 23;
        a[3] = 36;
        a[4] = 93;


        int l = a.length;

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

    }
}
