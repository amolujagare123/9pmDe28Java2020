package ArrayDemos;

public class TwoDArrayDemo {

    public static void main(String[] args) {

        int[][] a = new int[4][3]; // try  char, float , double , string

        a[0][0] = 56;
        a[0][1] = 46;
        a[0][2] = 36;

        a[1][0] = 16;
        a[1][1] = 65;
        a[1][2] = 51;

        a[2][0] = 50;
        a[2][1] = 17;
        a[2][2] = 11;

        a[3][0] = 76;
        a[3][1] = 86;
        a[3][2] = 53;


        int row = a.length;
        int col = a[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }





    }
}
