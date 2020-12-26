package person.billtsui.feature;

/**
 * @author billtsui
 * @date 2020/12/26
 */
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.getId(), o.getId());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return this.getId() == ((Person) obj).getId();
        } else {
            return false;
        }
    }
}
