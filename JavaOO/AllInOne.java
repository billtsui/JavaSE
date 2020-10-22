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

        Student s1 = new Student(-1000,"关云长");
        s1.show();

    }
}
