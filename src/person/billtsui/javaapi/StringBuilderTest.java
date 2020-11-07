package person.billtsui.javaapi;

/**
 * @author billtsui
 * @date 2020/11/1
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        //使用无参方式构造StringBuild类型的对象并打印容量和长度
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1);
        //16
        System.out.println("容量是：" + sb1.capacity());

        //0
        System.out.println("长度是：" + sb1.length());

        System.out.println("--------------------------");
        StringBuilder sb2 = new StringBuilder(20);

        //20
        System.out.println("容量是：" + sb2.capacity());
        //0
        System.out.println("长度是：" + sb2.length());

        System.out.println("---------------------------");
        StringBuilder sb3 = new StringBuilder("Hello World");
        // 16 + 字符串的长度
        System.out.println("容量是：" + sb3.capacity());
        System.out.println("长度是：" + sb3.length());

        //向字符串中插入和追加字符串
        sb3.insert(0, "abcd");

        //abcdHello World
        System.out.println("sb3 = " + sb3);

        //向末尾插入字符串
        sb3.insert(sb3.length(), "efgh");
        System.out.println("sb3 = " + sb3);

        //向末尾追加字符串内容
        sb3.append("hello world");
        System.out.println("sb3 = " + sb3);

        //扩容 是 oldCapacity * 2 + 2
        System.out.println("容量是：" + sb3.capacity());
        System.out.println("长度是：" + sb3.length());

        //删除下标为0的单个字符
        sb3.deleteCharAt(0);
        System.out.println("sb3 = " + sb3);

        //删除下标为[0,3)的字符
        sb3.delete(0, 3);
        System.out.println("sb3 = " + sb3);

        sb3.delete(11, 15);
        System.out.println("sb3 = " + sb3);

        sb3.setCharAt(0, 'A');
        System.out.println("sb3 = " + sb3);

        System.out.println("sb3 = " + sb3.reverse());

    }
}
