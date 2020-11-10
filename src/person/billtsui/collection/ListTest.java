package person.billtsui.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author billtsui
 * @date 2020/11/8
 */
public class ListTest {
    public static void main(String[] args) {
        List lt1 = new ArrayList();
        //由源码可知，当第一次调用add方法添加元素时，会给数组申请长度为10的一维数组，每次扩容会扩展为原来的1.5倍
        lt1.add("one");
        System.out.println("lt1 = " + lt1);
    }
}
