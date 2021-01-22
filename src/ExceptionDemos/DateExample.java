package ExceptionDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) throws ParseException, InterruptedException {

        String dateStr ="12/02/2020";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        //try {
            Date date = sd.parse(dateStr);
      /*
        } catch (ParseException e) {

            System.out.println("inside catch");
        }*/

        Thread.sleep(1000);

    }
}
