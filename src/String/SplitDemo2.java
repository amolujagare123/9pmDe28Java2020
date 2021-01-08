package String;

public class SplitDemo2 {

    public static void main(String[] args) {

        String str = "Hey Baby you are so lovely";

        String[] sArr = str.split(" ");

        for (int i=0;i<sArr.length;i++) {

            String currString = sArr[i];

            int l = currString.length();

            if(currString.charAt(l-1)=='y')
                System.out.println(sArr[i]);
        }

    }
}
