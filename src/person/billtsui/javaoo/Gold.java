package person.billtsui.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 17:52
 */
public class Gold implements Metal,Money {
    @Override
    public void light() {
        System.out.println("发出了金黄色的光芒");
    }

    @Override
    public void buy() {
        System.out.println("买了好多好吃的");
    }

    public static void main(String[] args) {
        //声明接口类型的引用指向实现类
        Metal mt = new Gold();
        mt.light();

        Money mn = new Gold();
        mn.buy();
    }
}
