package person.billtsui.collection;

import java.util.Collections;
import java.util.HashMap;

/**
 * @author billtsui
 * @date 2020/11/15
 * 如果key存在，就用新的value覆盖原来的value
 */
public class MapTest {
    public static void main(String[] args) {
        //准备一个Map集合并打印
        HashMap<Object, Object> m1 = new HashMap<>();
        System.out.println(m1);

        m1.put("1","one");
        m1.put("2","two");
        m1.put("3","three");

        System.out.println(m1);

        m1.put("1","1111");
        System.out.println(m1);
    }

}
