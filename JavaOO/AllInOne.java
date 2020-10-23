package JavaOO;

public class AllInOne {
    public static void main(String[] args) {
        Fib fib = new Fib();
        int result = fib.fib2(10);

        System.out.println("最终的结果是:" + result);

        Student s = new Student();
        s.setId(-1000);
        s.setName("张飞");
        s.show();

        Student s1 = new Student(-1000, "关云长");
        s1.show();

        People p1 = new People("刘备", "蜀国", 35);
        p1.show();

        People p2 = new People("曹操","魏国",40);
        p2.show();

        StaticBlock staticBlock0 = new StaticBlock();
        StaticBlock staticBlock1 = new StaticBlock();
        StaticBlock staticBlock2 = new StaticBlock();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
