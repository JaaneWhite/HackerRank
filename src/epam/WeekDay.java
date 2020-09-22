import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        GregorianCalendar calendar = new GregorianCalendar(year, month-1 , day);

       // int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        //System.out.println(dayofWeek);


    }

}

public class WeekDay {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();


        String res = Result.findDay(month, day, year);

        System.out.println(res);


    }
}