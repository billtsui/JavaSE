package JavaOO;

/**
 * 子类不能继承父类的构造方法和私有方法，但私有成员变量可以被继承只是不能直接访问
 */
public class Worker extends Person {
    private int salary;

    public Worker() {
        super(); // 表示调用父类的无参构造方法
        System.out.println("Worker()");
    }

    public Worker(String name, int age, int salary) {
        super(name, age);
        System.out.println("Worker(String,int,int)");
        // setName(name);
        // setAge(age);
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 2200) {
            this.salary = salary;
        } else {
            System.out.println("薪水不合理哟");
        }
    }

    public void work() {
        System.out.println("今天的砖头有点烫手...");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("我的薪水是:" + getSalary());
    }

}
