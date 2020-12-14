package person.billtsui.reflact;

import java.time.LocalDateTime;

/**
 * @author billtsui
 * @date 2020/12/12
 */
public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {

        //使用 类型.class
        System.out.println(String.class);

        System.out.println(int.class);

        System.out.println(LocalDateTime.class);

        //使用 对象.getClass()
        System.out.println(new StringBuilder().getClass());

        //使用 包装类.TYPE 获取基本数据类型的class对象
        System.out.println(Integer.TYPE);

        System.out.println(Integer.class);

        System.out.println(Class.forName("java.lang.String"));

        System.out.println(Class.forName("java.util.Date"));
    }
}
