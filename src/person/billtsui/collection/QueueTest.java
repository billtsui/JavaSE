package person.billtsui.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author billtsui
 * @date 2020/11/10
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        System.out.println("队列中的元素有：" + queue);

        System.out.println("-------------------");
        for (int i = 1; i <= 5; i++) {
            boolean b1 = queue.offer(i * 11);
            System.out.println("b1 = " + b1);
            System.out.println("队列中的元素有：" + queue);
        }

        int len = queue.size();
        for (int i = 0; i < len; i++) {
            System.out.println("出队的元素是：" + queue.poll());
        }
    }
}
