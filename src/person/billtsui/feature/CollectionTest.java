package person.billtsui.feature;

import java.util.List;
import java.util.Set;

/**
 * @author billtsui
 * @date 2020/12/26
 */
public class CollectionTest {
    public static void main(String[] args) {
        //不可变型
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        Set<Integer> integerSet = Set.of(6,7,8);


        //这两行代码编译OK，运行时会报UnsupportedOperationException
        integers.add(6);
        integerSet.add(9);

        System.out.println(integers);
    }
}
