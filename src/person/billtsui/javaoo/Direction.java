package person.billtsui.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/26 23:00
 * 编程实现所有方向的枚举
 */
public class Direction {
    //用于描述方向字符串的成员变量
    private  final String desc;

    public static final Direction UP = new Direction("向上");
    public static final Direction DOWN = new Direction("向下");
    public static final Direction LEFT = new Direction("向左");
    public static final Direction RIGHT = new Direction("向右");



    private Direction(String desc){
        this.desc = desc;
    }

    //通过公有的get方法可以在本类的外部访问该类成员变量的数值
    public String getDesc() {
        return desc;
    }
}
