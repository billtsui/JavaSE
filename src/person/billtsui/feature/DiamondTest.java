package person.billtsui.feature;

import java.util.Comparator;

/**
 * @author billtsui
 * @date 2020/12/26
 */
public class DiamondTest {
    public static void main(String[] args) {
        //我以为钻石操作符是什么呢…………原来是泛型的new方法可以省略类型
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
    }
}
