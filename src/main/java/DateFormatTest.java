import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by : allenwhm
 * DateTime : 2018-09-10 20:09
 **/
public class DateFormatTest {
    public static void main(String[] args) {
        /**
         * E, Mon/Tue
         * D, day in year
         * F, week in month, days in months past / 7
         * w, week in year
         * W, week in month(accurate)
         * a, am/pm
         * k, 24hour HH
         * K, 12hour hh
         * z, timezone
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd k:mm:ss a z w W F D E");

//        SimpleDateFormat sdf = new SimpleDateFormat();
//        sdf.applyPattern("yyyy-MM-dd HH:mm:ss SSS");

        Date date = new Date();
        System.out.println(sdf.format(date));

        long timeStamp = System.currentTimeMillis();
        System.out.println(sdf.format(timeStamp));
        System.out.println(sdf.format(new Date(timeStamp)));
    }
}
