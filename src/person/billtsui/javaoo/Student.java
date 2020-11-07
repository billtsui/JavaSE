package person.billtsui.javaoo;

/**
 * 封装首先要私有化成员变量
 * private 修饰成员变量
 */
public class Student {
    private int id;
    private String name;

    public Student(){

    }

    //在公有的构造方法中使用set方法进行合理值判断
    public Student(int id,String name){
        setId(id);
        setName(name);
    }

    //什么修饰符都没有叫做默认的访问权限，级别介于private和public之间
    void show() {
        System.out.println("我是" + this.getName() + ".我的学号是:" + this.getId());
    }

    public int getId() {
        return id;
    }

    //在set方法中，可以对值进行合理的判断
    public void setId(int id) {
        if (id > 0)
            this.id = id;
        else
            System.out.println("id不合法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
