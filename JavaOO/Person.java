package JavaOO;

public class Person {
    String name;
    int age;

    /* 构造方法
     * 如果不声明，编译器会有一个默认的构造方法
     */
    Person() {
        System.out.println("我是自定义构造方法！");
    }

    //有参构造方法
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String s) {
        this.name = s;
    }

    void setAge(int a) {
        this.age = a;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    // 可变长参数一定放最后一位，并且只能有一个变长参数
    void showArguments(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数为" + args[i]);
        }
    }

    public static void main(String[] args) {

        Person p = new Person("Bill Tsui",31);
        System.out.println(p.name);
        System.out.println(p.age);

        Person p1 = new Person("关羽",30);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}
