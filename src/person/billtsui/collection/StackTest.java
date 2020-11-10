package person.billtsui.collection;

import java.util.Stack;

/**
 * @author billtsui
 * @date 2020/11/10
 */
public class StackTest {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        System.out.println("s1 = " + s1);

        System.out.println("--------------------");
        for (int i = 1; i <= 5; i++) {
            Object obj = s1.push(i * 11);
            System.out.println("入栈的元素是：" + obj);
            System.out.println("栈中的元素有：" + s1);
        }

        //查看栈顶元素
        Object obj2 = s1.peek();
        System.out.println("获取到的栈顶元素是：" + obj2);

        System.out.println("--------------------");
        int size = s1.size();
        for (int j = 0; j < size; j++) {
            Object temp = s1.pop();
            System.out.println("出栈的元素是：" + temp);
            s2.push(temp);
        }

        for (int k = 1; k <= 5; k++) {
            Object temp = s2.pop();
            System.out.println("栈中的元素有：" + temp);
        }
    }
}
