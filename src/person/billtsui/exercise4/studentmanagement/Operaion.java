package person.billtsui.exercise4.studentmanagement;

import java.io.*;
import java.util.*;

/**
 * @author billtsui
 * @date 2020/11/16
 * 学生信息的操作类
 */
public class Operaion {

    /**
     * 增加学生信息
     */
    public void addStudent() {
        System.out.println("请按照格式输入学生信息 学号,姓名,年龄\n");
        Scanner scanner = new Scanner(System.in);
        String info = scanner.next();
        String[] infoArray = info.split(",");
        Student student = new Student();

        try {
            student.setId(Integer.parseInt(infoArray[0]));
            student.setName(infoArray[1]);
            student.setAge(Integer.parseInt(infoArray[2]));
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (Data.getInstance().getStudentList().stream().anyMatch(student1 -> student1.getId() == student.getId())) {
            System.out.println("该学号已被其他学生使用");
        } else {
            Data.getInstance().getStudentList().add(student);
            System.out.println("增加学生信息成功");
            System.out.println(student.toString());
            System.out.println("------------------------------------");
        }
    }

    /**
     * 打印全体学生信息
     */
    public void printAllStudent() {
        System.out.println("-----------全体学生信息如下-----------");
        Data.getInstance().getStudentList().forEach(item -> System.out.println(item.toString()));
        System.out.println("------------------------------------");
    }

    /**
     * 根据学号查找学生信息
     */
    public void searchStudent() {
        System.out.println("请输入要查找学生的学号\n");
        Scanner scanner = new Scanner(System.in);
        int studentId = scanner.nextInt();

        Optional<Student> studentOptional = Data.getInstance().getStudentList().stream().filter(student -> student.getId() == studentId).findFirst();
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            System.out.println("查找到该学号的学生：" + student);
        } else {
            System.out.println("未查找到" + studentId + "这个学号的学生");
        }
    }

    /**
     * 根据学号删除学生信息
     */
    public void delStudent() {
        System.out.println("请输入要删除学生的学号\n");
        Scanner scanner = new Scanner(System.in);
        int studentId = scanner.nextInt();

        Optional<Student> studentOptional = Data.getInstance().getStudentList().stream().filter(student -> student.getId() == studentId).findFirst();
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            Data.getInstance().getStudentList().remove(student);
            System.out.println("删除学生信息成功，被删除的学生信息为：" + student);
        } else {
            System.out.println("未查找到" + studentId + "这个学号的学生");
        }
    }

    public void editStudent() {
        System.out.println("请按照格式输入要修改学生的信息 学号,姓名,年龄");
        Scanner scanner = new Scanner(System.in);
        String info = scanner.next();
        String[] infoArray = info.split(",");
        Student student = new Student();

        try {
            student.setId(Integer.parseInt(infoArray[0]));
            student.setName(infoArray[1]);
            student.setAge(Integer.parseInt(infoArray[2]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Optional<Student> studentOptional = Data.getInstance().getStudentList().stream().filter(student1 -> student1.getId() == student.getId()).findFirst();
        if (studentOptional.isPresent()) {
            Student student1 = studentOptional.get();
            Data.getInstance().getStudentList().remove(student1);
            Data.getInstance().getStudentList().add(student);
            System.out.println("修改学生信息成功，修改前的学生信息为：" + student1);
            System.out.println("修改后的学生信息为：" + student);
        } else {
            System.out.println("未查找到" + student.getId() + "这个学号的学生");
        }
    }

    //读取学生信息
    public void init() {
        ObjectInputStream in = null;
        List<Student> studentList = null;

        File file = new File("./students.txt");
        if (file.exists()) {
            try {
                in = new ObjectInputStream(new FileInputStream("./students.txt"));
                studentList = (List<Student>) in.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (null != in) {
                    try {
                        in.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (studentList != null) {
            Data.getInstance().getStudentList().addAll(studentList);
        }
    }

    //保存学生信息
    public void save() {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./students.txt"));
            out.writeObject(Data.getInstance().getStudentList());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
