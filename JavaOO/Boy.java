package JavaOO;

public class Boy {
    String name;

    Boy(){
        //构造方法的第一行调用其他构造方法
        //this("无名");
        System.out.println("无参构造方法");
    }

    Boy(String name){
        this();
        System.out.println("有参构造方法");
        this.name = name;
    }

    void show(){
        System.out.println("我的名字是：" + name);
    }

    public static void main(String[] args) {
        //1、使用无参数方式构造对象
        Boy b1 = new Boy();
        b1.show();

        System.out.println("----------------------------");
        //2、使用有参方式构造对象
        Boy b2 = new Boy("张飞");
        b2.show();

        Boy b3 = null;
    }
}
