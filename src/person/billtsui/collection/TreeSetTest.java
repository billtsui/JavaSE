package person.billtsui.collection;

import java.util.TreeSet;

/**
 * 底层是红黑树实现，添加的元素会自然排序
 * 如果没有自然排序，那么要使用比较器排序
 * @author billtsui
 * @date 2020/11/15
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("one");
        System.out.println(treeSet);

        treeSet.add("o");
        System.out.println(treeSet);

        treeSet.add("a");
        System.out.println(treeSet);
        System.out.println("-----------------");

        TreeSet<Student> studentTreeset = new TreeSet<Student>();
        studentTreeset.add(new Student("liubei",40));
        studentTreeset.add(new Student("guanyu",35));
        studentTreeset.add(new Student("zhangfei",30));
        System.out.println(studentTreeset);

    }
}
