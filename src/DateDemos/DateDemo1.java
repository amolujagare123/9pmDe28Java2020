package DateDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        // lets convert the date into our desired format (String)
        // date to string

        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        String dateStr =  sd.format(date);
        System.out.println(dateStr);

        SimpleDateFormat sd1 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        String dateStr1 = sd1.format(date);
        System.out.println(dateStr1);


        // Date to String conversion

    }

}
