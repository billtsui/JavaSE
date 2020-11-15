package person.billtsui.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author billtsui
 * @date 2020/11/15
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("one");

        System.out.println(set);
    }
}
