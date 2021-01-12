package DateDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "10/02/2020";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Date date = sd.parse(dateStr);

        System.out.println(date);

        String dateStr0= "23-June-2016"; //⇒ dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");

        Date date0 = sd0.parse(dateStr0);
        System.out.println(date0);


        String dateStr1= "23 | June 16  8:34"; //⇒ dd | MMMM yy hh:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        System.out.println(sd1.parse(dateStr1));

        String dateStr3= "Thursday 2016/06/23"; //⇒ EEEE yyyy/MM/dd

        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        System.out.println(sd3.parse(dateStr3));



    }
}
