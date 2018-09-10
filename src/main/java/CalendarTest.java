import java.util.Calendar;

/**
 * Created by : allenwhm
 * DateTime : 2018-09-10 20:14
 **/
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("current time : " + calendar.getTime());
        System.out.println("year : " + calendar.get(Calendar.YEAR));
        System.out.println("month : " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("day : " + calendar.get(Calendar.DATE));

        System.out.println("day of week : " + calendar.get(Calendar.DAY_OF_WEEK)); // Sunday is the first day
        System.out.println("day of month : " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("day of year: " + calendar.get(Calendar.DAY_OF_YEAR));
    }
}
