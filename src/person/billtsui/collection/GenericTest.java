package person.billtsui.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author billtsui
 * @date 2020/11/14
 */
public class GenericTest {
    //1、准备一个支持泛型机制的List集合
    //2、向集合中添加元素并打印
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");

        System.out.println("list = " + list);

        String s = list.get(0);
        System.out.println("获取到的元素是："+ s);

        System.out.println("-------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println("list1 = " + list1);
    }
}
