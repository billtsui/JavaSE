package person.billtsui.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author billtsui
 * @date 2020/11/8
 */
public class CollectionPrintTest {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("one");
        c1.add("two");
        c1.add("three");
        c1.add(2);

        //使用迭代器遍历集合中的所有元素
        Iterator iterator = c1.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }
        System.out.println(c1);
    }
}
