package person.billtsui.exercise4.studentmanagement;

/**
 * @author billtsui
 * @date 2020/12/14
 */
public class AgeInvalidException extends Exception {
    private static final long serialVersionUID = -6974033720593930705L;

    public AgeInvalidException() {
    }

    public AgeInvalidException(String message) {
        super(message);
    }
}
