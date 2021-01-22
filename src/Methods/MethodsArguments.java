package Methods;

public class MethodsArguments {

    void getInt(int a)
    {
        System.out.println("a="+a);
    }

    void getDouble(double d)
    {
        System.out.println("d="+d);
    }

    void getChar(char c)
    {
        System.out.println("c="+c);
    }

    void getBoolean(boolean b)
    {
        System.out.println("b="+b);
    }

    void getArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

        System.out.println();
    }


    void getTwoDArray(String[][] sArr)
    {
        for(int i=0;i<sArr.length;i++)
        {
            for(int j=0;j<sArr[0].length;j++)
            {
                System.out.print(sArr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        MethodsArguments ob = new MethodsArguments();

        ob.getInt(12);

        int x =12;

        ob.getInt(x);

        ob.getDouble(1.1);
        ob.getChar('n');
        ob.getBoolean(true);

        int[] b = {23,12,12,1,111,345};

        ob.getArray(b);


        String[][] s = {

                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
        };

        ob.getTwoDArray(s);

    }
}
