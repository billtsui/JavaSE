package person.billtsui.collection;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author billtsui
 * @date 2020/11/15
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> lt1 = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("集合中的最大值是：" + Collections.max(lt1));
        System.out.println("集合中的最小值是：" + Collections.min(lt1));
        Collections.reverse(lt1);
        System.out.println("反转后集合中的元素：" + lt1);
        Collections.swap(lt1, 1, 4);
        System.out.println("交换元素后的集合为：" + lt1);
        Collections.shuffle(lt1);
        System.out.println("随机置换后的结果为：" + lt1);
    }
}
