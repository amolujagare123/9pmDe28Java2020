package WrapperClass;

public class WrapeerDemo4 {

    public static void main(String[] args) {

        String str1 = "11";
        String str2 = "22";

        System.out.println(str1+str2);

        int a1 = Integer.parseInt(str1);
        int a2 = Integer.parseInt(str2);

        System.out.println(a1+a2);

        // String to double or float

        String str3 = "12.45";

        double d = Double.parseDouble(str3);

        float f = Float.parseFloat(str3);

        // String to boolean
        String str5 = "true";

        boolean b = Boolean.parseBoolean(str5);

        int aa = 10 ;

        String s = ""+aa;

        // String to charcter

        String str6 = "s";
        char c = str6.charAt(0);


        int a = 20;

        float ff = a;

        int aa1 = (int) ff;




    }
}
