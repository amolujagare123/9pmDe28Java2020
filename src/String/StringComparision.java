package String;

public class StringComparision {

    public static void main(String[] args) {

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "Mahesh";
        String str5 = new String("amol");
        String str6 = new String("kajal");

        int a =10 ;
        int b = 20 ;

    //     a==b  --> true if a,b are equal else false
        // strings cant be comapared with == symbol
        // if you try to compare string variable, you are actually
        //comparing 2 addresses

        System.out.println(str1.equals(str2)) ; // true
        System.out.println(str1.equals(str3)) ; // false
        System.out.println(str1.equals(str4)) ; // false
        System.out.println(str1.equals(str5)) ; // true
        System.out.println(str1.equals(str6)) ; // false
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        System.out.println("===================");

        System.out.println(str1 == str2 ) ;  //  true
        System.out.println(str1 == str5 ) ; //  false
    }

}
