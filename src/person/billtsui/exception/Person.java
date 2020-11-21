package person.billtsui.exception;

/**
 * @author billtsui
 * @date 2020/11/19
 */
public class Person  {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) throws AgeException {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age > 0 && age <= 150) {
            this.age = age;
        } else {
            throw new AgeException("年龄不合理哟");
        }
    }
}
