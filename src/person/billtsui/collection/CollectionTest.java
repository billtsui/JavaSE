package person.billtsui.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author billtsui
 * @date 2020/11/8
 * 集合中可以添加不同类型的元素
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        System.out.println("集合中的元素有：" + c1);

        System.out.println("------------------------");
        boolean b1 = c1.add(new String("one"));

        b1 = c1.add(Integer.valueOf("2"));
        System.out.println("集合中的元素有：" + c1);

        Collection c2 = new ArrayList();
        c2.add("three");
        c2.add(4);
        c2.addAll(c1);
        System.out.println("集合中的元素是：" + c2);

        System.out.println("-------------------------");
        //判断集合中是否包含参数指定的单个元素
        //自定义类调用contains方法需要重写equals
        boolean r1 = c1.contains("one");
        System.out.println("c1中是否包含元素one:" + r1);
        System.out.println("c1中是否包含元素two:" + c1.contains("two"));

        System.out.println("---------------------------");
        //true
        b1 = c1.retainAll(c1);
        System.out.println("b1=" + b1);
    }
}
