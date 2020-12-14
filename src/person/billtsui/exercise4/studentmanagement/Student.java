package person.billtsui.exercise4.studentmanagement;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author billtsui
 * @date 2020/11/16
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 4282027858819201144L;
    //学号
    private int id;

    //姓名
    private String name;

    //年龄
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws IdInvalidException {
        if (id < 0) {
            throw new IdInvalidException("学号不符合规范");
        } else {
            this.id = id;
        }
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

    public void setAge(int age) throws AgeInvalidException {
        if (age < 0) {
            throw new AgeInvalidException("学生年龄不符合规范");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
