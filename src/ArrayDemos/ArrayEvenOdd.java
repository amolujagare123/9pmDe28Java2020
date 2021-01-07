package ArrayDemos;

public class ArrayEvenOdd {

    public static void main(String[] args) {

        int[] a = {45,32,12,21,3,1,11,22,31,12};

        for(int i=0;i<a.length;i++)
        {
            if(a[i] % 2 == 0)
             System.out.println(a[i]+" even");
            else
                System.out.println(a[i]+" odd");
        }

    }
}
