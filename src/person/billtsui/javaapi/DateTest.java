package person.billtsui.javaapi;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author billtsui
 * @date 2020/11/3
 */
public class DateTest {
    public static void main(String[] args) throws  Exception{
        Date date = new Date();
        System.out.println("date = " + date.toString());

        System.out.println("---------------");
        Date date1 = new Date(System.currentTimeMillis());
        System.out.println("date1 = " + date1);

        Date date2 = new Date(2000);
        System.out.println("获取到的毫秒数是：" + date2.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateFormat = sdf.format(new Date());
        System.out.println(dateFormat);

        Date date3 = sdf.parse(dateFormat);
        System.out.println(date3);
    }
}
