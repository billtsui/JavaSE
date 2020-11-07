package person.billtsui.javaoo;


/**
 * @author Bill Tsui
 * @date 2020/10/26 23:40
 */
public class DirectionUseTest {
    //根据传入的字符串内容打印方向信息
    private static void test1(String str) {
        switch (str) {
            case "向上":
                System.out.println("举头望明月");
                break;
            case "向下":
                System.out.println("低头思故乡");
                break;
            case "向左":
                System.out.println("左牵黄");
                break;
            case "向右":
                System.out.println("右擎苍");
                break;
            default:
                System.out.println("没有这样的方向哦");
                break;
        }
    }

    private static void test2(DirectionEnum str) {
        switch (str) {
            case UP:
                System.out.println("举头望明月");
                break;
            case DOWN:
                System.out.println("低头思故乡");
                break;
            case LEFT:
                System.out.println("左牵黄");
                break;
            case RIGHT:
                System.out.println("右擎苍");
                break;
            default:
                System.out.println("没有这样的方向哦");
                break;
        }
    }

    public static void main(String[] args) {
        DirectionUseTest.test1(Direction.UP.getDesc());
        DirectionUseTest.test2(DirectionEnum.DOWN);

        DirectionEnum[] values = DirectionEnum.values();
        DirectionEnum de = DirectionEnum.valueOf("DOWN");
        for (int i = 0; i < values.length; i++) {
            System.out.println("获取到的枚举对象名称是：" + values[i].toString());
            System.out.println("获取到的枚举对象的索引位置是：" + values[i].ordinal());
        }
        System.out.println("----------------------------");
        for (int i = 0; i < values.length; i++) {
            //当调用对象在参数对象之后是，获取到的比较结果为正数
            //相同位置是，获取到的比较结果为0
            //当调用对象在参数对象之前是，获取到的比较结果为 负数
            System.out.println(de.compareTo(values[i]));
        }
        System.out.println("------------------------------");
        for (DirectionEnum value : values) {
            value.show();
        }
    }
}
