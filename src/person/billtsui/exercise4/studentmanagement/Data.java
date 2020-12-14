package person.billtsui.exercise4.studentmanagement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author billtsui
 * @date 2020/11/16
 */
public class Data {
    private static Data data;
    private List<Student> studentList = new ArrayList<>();

    private Data() {

    }

    public static Data getInstance() {
        if (data == null) {
            data = new Data();
        }
        return data;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
