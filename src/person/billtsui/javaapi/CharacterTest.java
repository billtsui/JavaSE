package person.billtsui.javaapi;

/**
 * @author billtsui
 * @date 2020/10/29
 */
public class CharacterTest {
    public static void main(String[] args) {
        //在Java 5之前调用方法实现装箱和拆箱机制
        Character character = Character.valueOf('a');
        System.out.println("character = " + character);

        //拆箱
        char ch1 = character;
        System.out.println("ch1 = " + ch1);

        //自动拆装箱
        Character character1 = 'b';
        char ch2 = character1;
        System.out.println("c2 = " + ch2);

        //判断是否为大写字母
        System.out.println(Character.isUpperCase('C')); // true
        System.out.println(Character.isLowerCase('c')); //false

        //判断是否为数字字符
        System.out.println(Character.isDigit('2')); //true

        //转大小写
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
