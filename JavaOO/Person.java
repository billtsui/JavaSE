package JavaOO;

public class Person {
    String name;
    int age;

    void setName(String s) {
        this.name = s;
    }

    void setAge(int a) {
        this.age = a;
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    // 可变长参数一定放最后一位，并且只能有一个变长参数
    void showArguments(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数为" + args[i]);
        }
    }

    public static void main(String[] args) {
        
        Person p = new Person();
        p.name = "Bill Tsui";
        p.age = 31;
        System.out.println(p.name);
        System.out.println(p.age);

        Person p1 = new Person();
        p1.setAge(30);
        p1.setName("关羽");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}
