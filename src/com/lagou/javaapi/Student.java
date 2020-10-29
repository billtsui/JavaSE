package com.lagou.javaapi;

/**
 * @author billtsui
 * @date 2020/10/28
 */
public class Student {
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("学号不合理哟！");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (obj instanceof Student) {
            Student st = (Student) obj;
            return this.getId() == st.getId();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int type = 12;
        return type * 31 + this.getId();
    }
}
