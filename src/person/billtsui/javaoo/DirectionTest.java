package person.billtsui.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/26 23:06
 */
public class DirectionTest {
    public static void main(String[] args) {
        Direction d1 = Direction.UP;
        System.out.println("获取到的方向:" + d1.getDesc());
        DirectionEnum de = DirectionEnum.DOWN;
        System.out.println(de.getDesc());

    }
}
