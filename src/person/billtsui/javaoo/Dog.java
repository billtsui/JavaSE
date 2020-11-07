package person.billtsui.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/24 18:16
 */
public class Dog extends Animal {
    private int teeth;

    public Dog() {
    }

    public Dog(String name, String color, int teeth) {
        //表示调用父类的有参构造方法
        super(name, color);
        this.teeth = teeth;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        if (teeth > 0) {
            this.teeth = teeth;
        } else {
            System.out.println("牙齿数量不合理哟！！！");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("牙齿数量是:" + getTeeth());
    }
}
