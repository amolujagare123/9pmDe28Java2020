package Methods;

public class MethodsReturningValue {

    void myMethod() {

    }

    int getInt() {
        int a = 13;

        return a;

        // return  10;
    }

    char getchar() {
        char ch = 'v';

        return ch;
    }

    int[] getMyArray()
    {
        int[] a = {12,34,11,16,78,10,3,4,1};

        return  a;
    }

    String[][] getMyTwoDArray()
    {
       String[][] s = {
               {"abc1","pqr1","xyz1"},
               {"abc2","pqr2","xyz2"},
               {"abc3","pqr3","xyz3"},
            } ;

       return  s;
    }

    public static void main(String[] args) {

        MethodsReturningValue ob = new MethodsReturningValue();

        int x =10;  // x holds a value 10
        System.out.println(x);
        int y = x;
        System.out.println(y);

        int b = ob.getInt();
        System.out.println(b);
        System.out.println(ob.getInt());


        System.out.println(ob.getchar());

        char ch = ob.getchar();
        System.out.println(ch);

       // System.out.println(myMethod());


        int[] arr = ob.getMyArray();

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();


        String[][] ss = ob.getMyTwoDArray();

        for(int i = 0 ;i< ss.length ; i++)
        {

            for(int j=0;j<ss[0].length;j++)
            {
                System.out.print(ss[i][j]+" ");
            }

            System.out.println();
        }



    }

}
