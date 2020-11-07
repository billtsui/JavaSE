package person.billtsui.javaapi;

/**
 * @author billtsui
 * @date 2020/10/31
 */
public class StringCompareTest {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abcd";

        //用a的每个位置的字符ASCII减去B的每个位置的字符的ASCII
        //如果部分字符一样，就比较长度
        System.out.println(a.compareTo(b)); //-1
        System.out.println(a.compareTo("a")); //2
        System.out.println(a.compareTo("abc")); //0
        System.out.println(a.compareToIgnoreCase("Abc")); //0
    }
}
