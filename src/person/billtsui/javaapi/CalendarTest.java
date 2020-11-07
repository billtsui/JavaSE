package person.billtsui.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author billtsui
 * @date 2020/11/3
 */
public class CalendarTest {
    public static void main(String[] args) {
        Date d1 = new Date(108, Calendar.AUGUST,8,20,8,8);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d1));

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,Calendar.NOVEMBER,3);
        System.out.println(sdf.format(calendar.getTime()));

        calendar.set(Calendar.YEAR,2021);
        System.out.println(sdf.format(calendar.getTime()));

        //增加两个月
        calendar.add(Calendar.MONTH,2);
        System.out.println(sdf.format(calendar.getTime()));


    }
}
