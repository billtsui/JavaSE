package person.billtsui.exercise4.studentmanagement;

/**
 * 学号异常类
 * @author billtsui
 * @date 2020/12/14
 */
public class IdInvalidException extends  Exception {

    private static final long serialVersionUID = -5343869052302956037L;

    public IdInvalidException() {
    }

    public IdInvalidException(String message) {
        super(message);
    }
}
